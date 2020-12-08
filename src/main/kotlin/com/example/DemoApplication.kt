package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    SpringApplicationBuilder(DemoApplication::class.java)
        .run(*args)
}
