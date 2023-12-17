package ru.nativespeakers.chatback

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/chat")
class ChatController {
    @PostMapping("/send")
    fun sendMessage(@RequestBody messageDTO: MessageDTO) =
        synchronized(messages) {
            messages.add(messageDTO.toMessage())
        }

    @GetMapping("/messages")
    fun getMessages(): List<Message> = messages
}