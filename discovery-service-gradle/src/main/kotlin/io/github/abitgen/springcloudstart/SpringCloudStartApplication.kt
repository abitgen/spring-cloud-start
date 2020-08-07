package io.github.abitgen.springcloudstart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
open class SpringCloudStartApplication

fun main(args: Array<String>) {
    println("HI")
    runApplication<SpringCloudStartApplication>(*args)
}
