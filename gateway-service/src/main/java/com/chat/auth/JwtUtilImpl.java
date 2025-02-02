package com.chat.auth;

import com.chat.constant.HttpConstant;
import com.chat.payload.JwtPayload;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.*;
import java.util.function.Function;

@Component
@RequiredArgsConstructor
public class JwtUtilImpl extends AuthUtil {

    private final JwtSecretKey jwtSecretKey;

    @Override
    public SecretKey getKey() {
        return jwtSecretKey.secretKey();
    }

    @Override
    public Claims getBody(String token) {
        return extractClaims(token).getPayload();
    }

//    public Jws<Claims> extractClaims(String token) {
//        return Jwts.parserBuilder().setSigningKey(getKey()).build().parseClaimsJws(token);
//    }

    public Jws<Claims> extractClaims(String token) {
        SecretKey key = getKey(); // Ensure this returns a SecretKey instance
        return Jwts.parser()
                .verifyWith(key)
                .build()
                .parseSignedClaims(token);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        return claimsResolver.apply(extractClaims(token).getPayload());
    }

//    public String generateLoginJwtToken(String username, Collection<? extends GrantedAuthority> authorities, String tokenId, Date date) {
//        return Jwts.builder()
//                .setSubject(username)
//                .claim(HttpConstant.JWT_AUTH_SUBJECT, authorities)
//                .setIssuedAt(date)
//                .setId(tokenId)
//                .signWith(getKey())
//                .compact();
//    }

    public String generateLoginJwtToken(String username, Collection<? extends GrantedAuthority> authorities, String tokenId, Date date) {
        return Jwts.builder()
                .claims()
                .subject(username)
                .add(HttpConstant.JWT_AUTH_SUBJECT, authorities)
                .issuedAt(date)
                .id(tokenId)
                .and()
                .signWith(getKey())
                .compact();
    }

    public String generateTokenForLogin(String name, Collection<? extends GrantedAuthority> authorities, String tokenId) {
        return this.generateLoginJwtToken(name, authorities, tokenId, new Date());
    }

    public String generateTokenForLogin(String name, Collection<? extends GrantedAuthority> authorities) {
        return this.generateTokenForLogin(name, authorities, UUID.randomUUID().toString());
    }

    public String getUsernameFromToken(String token) {
        return getBody(pickBearer(token)).getSubject();
    }

    private String pickBearer(String token) {
        return token.replaceFirst("Bearer ", "");
    }

    public List<Map<String, String>> getAuthorities(String token) {
        return (List<Map<String, String>>) getBody(token).get("authorities");
    }

    public Optional<JwtPayload> verify(String token) {
        Claims body = getBody(token);
        JwtPayload jwtPayload = new JwtPayload();
        jwtPayload.setAuthorities((List<Map<String, String>>) body.get("authorities"));
        jwtPayload.setAvailable(true);
        jwtPayload.setUsername(body.getSubject());
        return Optional.of(jwtPayload);
    }
}
