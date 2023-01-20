package com.pffm.kotlin.samples

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloSpringBoot

fun main(args: Array<String>) {
    runApplication<HelloSpringBoot>(*args)
}