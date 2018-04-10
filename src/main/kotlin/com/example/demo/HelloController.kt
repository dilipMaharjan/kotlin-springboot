package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMethod


@RestController
class HelloController {

    @GetMapping("//")
    fun index(): String {
        return "Hello Spring Boot With Kotlin"
    }

}