package com.example.dynamicrecyclerview.compose

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.dynamicrecyclerview.data.DynamicLayoutList

@Composable
fun DisplayLayout(buttonOnClick: (String)->(Unit)) {

    val layout = remember { DynamicLayoutList.layouts }

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = layout,
            itemContent = {
                LayoutItem(layout = it, buttonOnClick)
            }
        )
    }
}