package com.github.phpcoder

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class TodoReadyApplication

fun main(args: Array<String>) {
    SpringApplication.run(TodoReadyApplication::class.java, *args)
}
