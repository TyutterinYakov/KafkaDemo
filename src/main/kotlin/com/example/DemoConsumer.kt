package com.example

import org.apache.kafka.clients.consumer.ConsumerRecord
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class DemoConsumer(private val counterService: CounterService) {



    @KafkaListener(topics = ["quickstart-events"], concurrency = "10")
    fun listenerTopic(record: ConsumerRecord<String, String>) {
        counterService.increment()
    }
}