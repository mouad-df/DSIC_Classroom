package com.example.estm_project.compose.MyClasses

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.estm_project.compose.utils.Class_header
import com.example.estm_project.compose.utils.SimpleCard

@Composable
fun English() {
    Surface(
        color = Color(0xffeeeeee)
    ) {
        Column(Modifier.fillMaxSize()) {
            Class_header(className = "English for ICT", color = Color(0xFF6c6377))

            SimpleCard("JALAL ISMAILI", "Syllabus & topics", "12 Dec", "2")



        }
    }
}

@Preview(showBackground = true)
@Composable
fun English_prev() {
    English()
}