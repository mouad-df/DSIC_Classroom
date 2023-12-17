package com.example.estm_project.compose.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Person(name:String,color: Color) {
    Surface {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                modifier = Modifier
                    .height(40.dp)
                    .width(40.dp), shape = CircleShape, color = color
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = name.get(0).toString(),
                        textAlign = TextAlign.Center,
                        color = Color.White
                    )

                }

            }
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = name)

        }
    }
}

@Preview
@Composable
fun Person_prev() {
    Person("Lahcen Hasnaoui", Color(0xffe8bd3d))
}