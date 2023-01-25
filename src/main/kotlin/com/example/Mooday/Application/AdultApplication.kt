package com.example.Mooday.Application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AdultApplication

fun main(args: Array<String>) {
	runApplication<AdultApplication>(*args)
}
