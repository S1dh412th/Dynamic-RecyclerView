package com.example.dynamicrecyclerview.data.model

import java.io.Serializable

data class DynamicLayout (
    val isSent: Boolean,
    val text: Text,
    val button: Button,
    val image: Image
): Serializable

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

