package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaDemoApplication

fun main(args: Array<String>) {
//	runApplication<KafkaDemoApplication>(*args)

	val props = Properties();
	props[ProducesConfig.BOOTS]
}
