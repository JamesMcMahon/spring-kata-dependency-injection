plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.12.1")
    testImplementation("org.springframework:spring-test:6.2.10")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Most examples are using vanilla Spring but bringing in Boot for some useful additions
    implementation("org.springframework.boot:spring-boot-autoconfigure:3.5.5")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
