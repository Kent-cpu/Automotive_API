package com.example.automotive_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class AutomotiveApiApplication

fun main(args: Array<String>) {
	runApplication<AutomotiveApiApplication>(*args)
}