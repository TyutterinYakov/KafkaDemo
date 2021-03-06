package com.example

import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicInteger

@Service
class CounterService {

    private var counter = AtomicInteger(0)

    fun increment(){
        counter.incrementAndGet()
    }

    fun getResult(): Int {
        return counter.get()
    }
}