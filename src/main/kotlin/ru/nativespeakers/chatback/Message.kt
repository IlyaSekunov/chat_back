package ru.nativespeakers.chatback

import org.springframework.boot.autoconfigure.security.SecurityProperties.User
import java.util.Date

data class Message(
    val message: String,
    val sender: User,
    val date: Date
)

data class MessageDTO(
    val sender: User,
    val message: String
)

fun convertMessageDtoToMessage(messageDTO: MessageDTO) = Message(
    message = messageDTO.message,
    sender = messageDTO.sender,
    date = Date()
)