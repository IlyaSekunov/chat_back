package ru.nativespeakers.chatback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChatbackApplication

fun main(args: Array<String>) {
    runApplication<ChatbackApplication>(*args)
}
