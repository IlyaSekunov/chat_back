package ru.nativespeakers.chatback

import java.util.Date

data class Message(
    val id: Long,
    val message: String,
    val sender: ChatUser,
    val date: Date
)

data class MessageDTO(
    val sender: ChatUser,
    val message: String
)

fun MessageDTO.toMessage() = Message(
    id = messages.size.toLong(),
    message = message,
    sender = sender,
    date = Date()
)