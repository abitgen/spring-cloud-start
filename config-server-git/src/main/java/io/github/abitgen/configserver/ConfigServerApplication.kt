package io.github.abitgen.configserver

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.core.env.Environment

@SpringBootApplication
@EnableConfigServer
open class ConfigServerApplication @Autowired constructor(val env: Environment) : CommandLineRunner{
    override fun run(vararg args: String?) {
        println(env.getProperty("spring.cloud.config.server.git.username"));
        println(env.getProperty("MY_GIT_PASSWORD"));
    }

}
fun main(args: Array<String>) {
    SpringApplication.run(ConfigServerApplication::class.java, *args)
}