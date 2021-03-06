package io.github.abitgen.springcloudstart

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.context.config.annotation.RefreshScope

@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
open class UsersApplication

fun main(args: Array<String>) {
    println("Starting Users Service")
    runApplication<UsersApplication>(*args)
}
