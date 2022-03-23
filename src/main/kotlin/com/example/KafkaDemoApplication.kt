package com.example

import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.clients.producer.ProducerRecord
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class KafkaDemoApplication

fun main(args: Array<String>) {
//	runApplication<KafkaDemoApplication>(*args)

	val props = Properties();
	props[ProducerConfig.BOOTSTRAP_SERVERS_CONFIG] = "localhost:9092"
	props[ProducerConfig.CLIENT_ID_CONFIG] = "clientId"
	props[ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG] = StringSerializer::class.java.name
	props[ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG] = StringSerializer::class.java.name

	val producer = KafkaProducer<String, String>(props)
	val topic = "quickstart-events"
	producer.send(ProducerRecord(topic, "Hello from JVM"))
}
