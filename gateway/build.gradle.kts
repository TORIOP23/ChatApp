plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-gateway")

    testImplementation("io.projectreactor:reactor-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${libs.versions.springCloudVersion.get()}")
    }
}