package com.aslanjavasky.springboot.triptohogwarts

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.PropertySource

@SpringBootApplication
class TriptohogwartsApplication

fun main(args: Array<String>) {
	runApplication<TriptohogwartsApplication>(*args)
}
