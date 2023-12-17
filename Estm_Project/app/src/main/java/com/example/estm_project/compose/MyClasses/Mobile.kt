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
fun Mobile() {
    Surface(
        color = Color(0xffeeeeee)
    ) {
        Column(Modifier.fillMaxSize()) {
            Class_header(className = "DSIC5-Developpement Mobile", color = Color(0xFFc48b9b))

            SimpleCard(
                "ZAKARIA AIT ELMOUDEN",
                "Planning des presentations",
                "11 Dec",
                "2"
            )
            SimpleCard(
                profName = "ZAKARIA AIT ELMOUDEN",
                annonce = "TP5 : SQLITE (Solution)",
                "23 Nov (Edited 23 Nov)",
                "2"
            )
            SimpleCard(
                profName = "ZAKARIA AIT ELMOUDEN",
                annonce = "SQLITE : Solution de l'étude de cas",
                "23 Nov",
                "2"
            )
            SimpleCard(profName = "ZAKARIA AIT ELMOUDEN", annonce = "TP5 : SQLITE", "23 Nov", "1")
            SimpleCard(
                profName = "ZAKARIA AIT ELMOUDEN",
                annonce = "Chapitre 4 : SQLITE",
                "21 Nov",
                "2"
            )

            SimpleCard(
                profName = "ZAKARIA AIT ELMOUDEN",
                annonce = "TP4 : Basic Text Editor (Solution)",
                "16 Nov",
                "1"
            )


        }
    }

}

@Preview(showBackground = true)
@Composable
fun Mobile_prev() {
    Mobile()

}