package com.example

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class DemoController(
    private val template: KafkaTemplate<String, String>,
    private val counterService: CounterService
) {

    private val topic = "quickstart-events"

    @GetMapping("/send-random-message")
    fun sendRandomMessage():String {
        template.send(topic, UUID.randomUUID().toString(), UUID.randomUUID().toString())
        return "OK"
    }

    @GetMapping("/counter-result")
    fun getCounterResult() = counterService.getResult()
}