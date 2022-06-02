package com.cybergod.websocket_stomp.controller

import com.cybergod.websocket_stomp.model.Greeting
import com.cybergod.websocket_stomp.model.HelloMessage
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import org.springframework.web.util.HtmlUtils

@Controller
class GreetingController {



    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    @Throws(Exception::class)
    fun greeting(message: HelloMessage): Greeting {
        //Thread.sleep(1000) // simulated delay

        println("Hello, $message")
        return Greeting("Hello, " + HtmlUtils.htmlEscape(message.name!!) + "!")
    }




}