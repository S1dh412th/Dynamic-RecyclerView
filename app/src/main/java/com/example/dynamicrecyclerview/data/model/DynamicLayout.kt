package com.example.dynamicrecyclerview.data.model

data class DynamicLayout (
    val text: Text,
    val button: Button,
    val image: Image
)

data class Image (
    val isImage: Boolean,
    val imgUrl: String
)

data class Text (
    val isText: Boolean,
    val value: String
)

data class Button (
    val isButton: Boolean,
    val value: String
)

