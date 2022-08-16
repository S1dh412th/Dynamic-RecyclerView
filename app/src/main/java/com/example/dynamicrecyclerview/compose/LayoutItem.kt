package com.example.dynamicrecyclerview.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.dynamicrecyclerview.R
import com.example.dynamicrecyclerview.data.model.DynamicLayout

@Composable
fun LayoutItem(layout: DynamicLayout, buttonOnClick: (String)->(Unit)) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = if(layout.isSent) Alignment.End else Alignment.Start
    ) {
        Card(
            modifier = Modifier
                .padding(10.dp),
            elevation = 10.dp,
            shape = RoundedCornerShape(corner = CornerSize(10.dp))
        ) {
            Column(
                modifier = Modifier
                    .background(color = if(layout.isSent) Color.Cyan else Color.LightGray)
                    .padding(10.dp),
                horizontalAlignment = if(layout.isSent) Alignment.End else Alignment.Start,

            ) {
                if (layout.image.isImage) {
                    AsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(layout.image.imgUrl)
                            .build(),
                        placeholder = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = "Image",
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
                if (layout.button.isButton) {
                    Button(onClick = {
                        buttonOnClick(layout.button.value)
                    }) {
                        Text(text = layout.button.value)
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                if (layout.text.isText) {
                    Text(text = layout.text.value)
                }
            }
        }
    }
}