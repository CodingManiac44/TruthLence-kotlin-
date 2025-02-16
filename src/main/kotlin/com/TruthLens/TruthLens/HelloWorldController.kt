package com.TruthLens.TruthLens

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello, kotlin!"
    }
}



