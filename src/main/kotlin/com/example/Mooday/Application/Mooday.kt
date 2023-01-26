package com.example.mooday.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Mooday

fun main(args: Array<String>) {
    runApplication<Mooday>(*args)
}