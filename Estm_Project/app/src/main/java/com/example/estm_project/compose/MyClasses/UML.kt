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
fun Uml() {
    Surface(
        color = Color(0xffeeeeee)
    ) {
        Column(Modifier.fillMaxSize()) {
            Class_header(className = "UML 23/24", color = Color(0xFFf8ad9d))

            SimpleCard("AlAE EL ALAMI", "cours semaine 1 UML", "23 Oct", "1")
            SimpleCard(
                profName = "AlAE EL ALAMI",
                annonce = "td use case",
                "30 Oct (Edited 5 Nov)",
                "1"
            )
            SimpleCard(
                profName = "AlAE EL ALAMI",
                annonce = "cours UML diagrame de classe",
                "31 Oct",
                "1"
            )
            SimpleCard(profName = "AlAE EL ALAMI", annonce = "TP3 : UML", "3 Nov", "1")


        }
    }

}

@Preview(showBackground = true)
@Composable
fun Uml_prev() {
    Uml()

}