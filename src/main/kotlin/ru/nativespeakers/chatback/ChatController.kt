package ru.nativespeakers.chatback

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/chat")
class ChatController(private val chatService: ChatService) {
    @PostMapping("/send")
    fun sendMessage(@RequestBody messageDTO: MessageDTO) {
        val message = convertMessageDtoToMessage(messageDTO)
        chatService.sendMessage(message)
    }

    @GetMapping("/messages")
    fun getMessages(): List<Message> = chatService.messages
}