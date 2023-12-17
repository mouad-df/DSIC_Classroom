package com.example.estm_project.compose.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun No_Homework() {
    Surface (
        Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .background(color = Color.White),
    ){
        Column(
            Modifier

                .fillMaxSize().fillMaxHeight()
                .background(color = Color.White),
//            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(250.dp))
            Text(
                text = "No assignments yet. Lucky you!",
                fontWeight = FontWeight.Medium,
                fontSize = 22.sp
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Homework_prev() {
    No_Homework()

}