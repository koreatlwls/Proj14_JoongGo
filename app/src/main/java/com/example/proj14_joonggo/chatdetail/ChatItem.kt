package com.example.proj14_joonggo.chatdetail

data class ChatItem(
    val senderId: String,
    val message: String
) {

    constructor(): this("", "")
}