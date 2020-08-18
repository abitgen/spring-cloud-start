package io.github.abitgen.springcloudstart.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController @Autowired constructor(val env: Environment) {

    @GetMapping("/status/check")
    fun statusCheck(): String {
        return "User Service status up"
    }

    @GetMapping("/resource/value")
    fun getResourceValue(): String? {
        return env.getProperty("sample.message")
    }
}