package com.mnhyim.research_avatar.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mnhyim.research_avatar.R

@Composable
fun AvatarScreenNonCanvas() {
    Column(
        modifier = Modifier
            .border(2.dp, Color.Green)
            .padding(16.dp)
    ) {

        Box(modifier = Modifier
            .fillMaxWidth()
            .weight(0.9f)
            .border(2.dp, Color.Red)) {
            Image(
                painter = painterResource(id = R.drawable.base),
                contentDescription = null,
                modifier = Modifier.border(2.dp, Color.Blue).align(Alignment.Center)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .border(2.dp, Color.Red)
                .weight(0.1f)
        ) {
            Button(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            ) {
                Text(text = "TEST")
            }
            Button(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            ) {
                Text(text = "TEST")
            }
            Button(
                onClick = { /*TODO*/ }, modifier = Modifier
                    .weight(1f)
                    .padding(4.dp)
            ) {
                Text(text = "TEST")
            }
        }
    }
}