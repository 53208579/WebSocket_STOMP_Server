package com.cybergod.websocket_stomp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebSocketStompServerApplication

fun main(args: Array<String>) {
	runApplication<WebSocketStompServerApplication>(*args)
}
