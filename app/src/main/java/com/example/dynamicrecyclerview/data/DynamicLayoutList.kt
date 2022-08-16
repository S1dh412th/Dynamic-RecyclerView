package com.example.dynamicrecyclerview.data

import com.example.dynamicrecyclerview.data.model.Button
import com.example.dynamicrecyclerview.data.model.DynamicLayout
import com.example.dynamicrecyclerview.data.model.Image
import com.example.dynamicrecyclerview.data.model.Text
import kotlinx.coroutines.flow.flowOf

object DynamicLayoutList {

    val layouts = listOf(

        DynamicLayout(
            isSent = false,
            text = Text(true, "1st Text"),
            button = Button(true, "1st Button"),
            image = Image(true, "https://images.freeimages.com/images/previews/c34/dog-1392233.jpg")
        ),
        DynamicLayout(
            isSent = true,
            text = Text(false, "2nd Text"),
            button = Button(true, "2nd Button"),
            image = Image(true, "https://images.freeimages.com/images/previews/e04/yellow-frontal-with-ivy-1228121.jpg")
        ),
        DynamicLayout(
            isSent = false,
            text = Text(true, "3rd Text"),
            button = Button(false, "3rd Button"),
            image = Image(true, "https://images.freeimages.com/images/previews/1b8/blue-butterfly-1401823.jpg")
        ),
        DynamicLayout(
            isSent = true,
            text = Text(true, "4th Text"),
            button = Button(true, "4th Button"),
            image = Image(false, "https://images.freeimages.com/images/previews/c34/dog-1392233.jpg")
        )
    )
}