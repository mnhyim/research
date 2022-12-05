package com.mnhyim.research_avatar.screen

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.mnhyim.research_avatar.R

@Composable
fun AvatarScreen() {

    val baseImage = ImageBitmap.imageResource(id = R.drawable.base)
    val baseHeight = baseImage.height
    val baseWidth = baseImage.width

    val glassesImage = ImageBitmap.imageResource(id = R.drawable.d)

    Column {
        Canvas(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .border(1.dp, Color.Red)
        ) {
            val height = size.height
            val width = size.width
            drawLine(
                start = Offset(x = width / 2f, y = 0f),
                end = Offset(x = width / 2f, y = height),
                color = Color.Red,
                strokeWidth = 4F
            )
            drawLine(
                start = Offset(x = 0f, y = width * 0.43f),
                end = Offset(x = height, y = width * 0.43f),
                color = Color.Green,
                strokeWidth = 4F
            )

            drawImage(
                image = glassesImage,
                topLeft = Offset(x = (width - baseWidth) / 2f, y = (height - baseHeight) / 2f)
            )
            scale(
                scale = 0.5f
            ) {
                drawImage(
                    image = baseImage,
                )
            }


        }
        Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
            Text(text = "TEST")
        }
    }
}