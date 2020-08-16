package io.github.abitgen.springcloudstart.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient
import org.springframework.cloud.gateway.discovery.DiscoveryLocatorProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@EnableDiscoveryClient
open class GatewayDiscoveryConfiguration(@Autowired val discoveryLocatorProperties:DiscoveryLocatorProperties) {

    @Bean
    open fun discoveryClientRouteLocator(discoveryClient: ReactiveDiscoveryClient): DiscoveryClientRouteDefinitionLocator {

        return DiscoveryClientRouteDefinitionLocator(discoveryClient, discoveryLocatorProperties)
    }
}