package ru.nativespeakers.chatback

import org.springframework.stereotype.Service

@Service
class ChatService {
    private val _messages: MutableList<Message> = ArrayList()
    val messages: List<Message> get() = _messages

    fun sendMessage(message: Message) =
        synchronized(_messages) {
            _messages.add(message)
        }
}
