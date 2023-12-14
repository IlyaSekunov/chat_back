package ru.nativespeakers.chatback

import org.springframework.stereotype.Service

@Service
class ChatService {
    fun sendMessage(message: Message) =
        synchronized(messages) {
            messages.add(message)
        }
}
