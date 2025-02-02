plugins {
    id("buildlogic.java-common-conventions")
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

dependencies {
    api(libs.spring.retry)
    api(libs.spring.aspects)
    compileOnly(libs.lombok)
    annotationProcessor(libs.lombok)
}