package com.boot_kotlin.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootKotlinCrudApplication

fun main(args: Array<String>) {
	runApplication<SpringbootKotlinCrudApplication>(*args)
}
