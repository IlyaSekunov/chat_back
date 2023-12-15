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

fun convertMessageDtoToMessage(messageDTO: MessageDTO) = Message(
    id = messages.size.toLong(),
    message = messageDTO.message,
    sender = messageDTO.sender,
    date = Date()
)