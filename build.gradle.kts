import java.net.URI

buildscript{
   /* dependencies {
        classpath("com.bmuschko:gradle-docker-plugin:6.6.0")
    }*/
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.3.1.RELEASE")
    }
}

plugins {
    java
    kotlin("jvm") version "1.3.61"
    kotlin("plugin.spring") version "1.3.61"
}

repositories {
    mavenCentral()
    maven {
        url = URI.create("http://repo.maven.apache.org/maven2")
    }
}

subprojects{
    repositories {
        mavenCentral()
        jcenter()
        maven {
            url = URI.create("http://repo.maven.apache.org/maven2")
        }
    }
    dependencies {
        apply(plugin = "org.jetbrains.kotlin.jvm")
        implementation(kotlin("stdlib-jdk8"))
        testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    }

    /*test {
        useJUnitPlatform()
    }*/
}




group = "io.github.abitgen"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

