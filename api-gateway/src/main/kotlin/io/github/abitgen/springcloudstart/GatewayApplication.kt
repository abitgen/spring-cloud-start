package io.github.abitgen.springcloudstart

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties

@SpringBootApplication
@EnableDiscoveryClient
open class GatewayApplication : CommandLineRunner{

    @Autowired
    lateinit var discoveryLocatorProperties: DiscoveryLocatorProperties

    override fun run(vararg args: String?) {
        println(discoveryLocatorProperties)
    }

}

fun main(args: Array<String>) {
    println("Starting Api Gateway")
    runApplication<GatewayApplication>(*args)
}
