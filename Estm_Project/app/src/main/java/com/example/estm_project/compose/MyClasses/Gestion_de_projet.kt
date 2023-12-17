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
fun Gestion_de_projet() {
    Surface(
        color = Color(0xffeeeeee)
    ) {
        Column(Modifier.fillMaxSize()) {
            Class_header(className = "Gestion de Projet 2023", color = Color(0xFF7d7eec))

            SimpleCard("LAHCEN HASNAOUI", "Cours java MARDI 12 Novenmbre", "9 Dec", "1")
            SimpleCard(
                profName = "LAHCEN HASNAOUI",
                annonce = "Devoir a rendre Mercredi prochain",
                "2 Nov",
                "1"
            )
            SimpleCard(profName = "LAHCEN HASNAOUI", annonce = "exemple TD", "31 Oct", "1")
            SimpleCard(profName = "LAHCEN HASNAOUI", annonce = "vidéo MSProject", "31 Oct", "1")
            SimpleCard(profName = "LAHCEN HASNAOUI", annonce = "chapitre 3,4 et 5", "29 Oct", "1")
            SimpleCard(profName = "LAHCEN HASNAOUI", annonce = "TD 2", "29 Oct", "1")


        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun Gestion_de_projet_preview() {
    Gestion_de_projet()

}
