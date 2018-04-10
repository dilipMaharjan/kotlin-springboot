package com.example.demo

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class HelloControllerTest {
    @Test
    fun index() {
        var helloController = HelloController()
        assertEquals(helloController.index(), "Hello Spring Boot With Kotlin")
    }
}
