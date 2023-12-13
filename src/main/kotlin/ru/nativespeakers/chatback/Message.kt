package ru.nativespeakers.chatback

import java.util.Date

data class Message(
    val message: String,
    val sender: ChatUser,
    val date: Date
)

data class MessageDTO(
    val sender: ChatUser,
    val message: String
)

fun convertMessageDtoToMessage(messageDTO: MessageDTO) = Message(
    message = messageDTO.message,
    sender = messageDTO.sender,
    date = Date()
)