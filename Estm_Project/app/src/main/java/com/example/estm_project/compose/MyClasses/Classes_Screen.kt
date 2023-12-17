package com.example.estm_project.compose.MyClasses

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estm_project.screenIndex

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Classes_Screen() {
    Column(
        Modifier
            .fillMaxSize(),
    ) {

        Card(
            onClick = {
                screenIndex.value = 2
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp)
                .height(120.dp)
                .width(500.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF7d7eec), //Card background color
                contentColor = Color.White  //Card content color,e.g.text
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column() {
                    Text("Gestion de Projet 2023", fontSize = 22.sp)
                    Spacer(Modifier.height(4.dp))
                    Text("LP-DSIC", fontSize = 13.sp)

                }
                Text(text = "LAHCEN HASNAOUI MOULAY", fontSize = 10.sp)
            }
        }
        //                        Spacer(modifier = Modifier.height(2.dp))
        Spacer(modifier = Modifier.height(0.dp))
        Card(
            onClick = {
                screenIndex.value = 3
//                selectedItem =
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp)
                .height(120.dp)
                .width(500.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFc48b9b), //Card background color
                contentColor = Color.White  //Card content color,e.g.text
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column() {
                    Text("DSIC - Développement Mobile", fontSize = 22.sp)
                    Spacer(Modifier.height(4.dp))
                    Text("LP-DSIC", fontSize = 13.sp)

                }
                Text(text = "ZAKARIA AIT ELMOUDEN", fontSize = 10.sp)
            }
        }

        Card(
            onClick = {
                screenIndex.value = 4
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp)
                .height(120.dp)
                .width(500.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFf8ad9d), //Card background color
                contentColor = Color.White  //Card content color,e.g.text
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column() {
                    Text("UML 23/24", fontSize = 22.sp)
                    Spacer(Modifier.height(4.dp))
                    Text("LP-DSIC", fontSize = 13.sp)

                }
                Text(text = "ALAE EL ALAMI", fontSize = 10.sp)
            }
        }

        Card(
            onClick = {
                screenIndex.value = 5

            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp)
                .height(120.dp)
                .width(500.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF6c6377), //Card background color
                contentColor = Color.White  //Card content color,e.g.text
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column() {
                    Text("English for ICT", fontSize = 22.sp)
                    Spacer(Modifier.height(4.dp))
                    Text("LP-DSIC", fontSize = 13.sp)

                }
                Text(text = "JALAL ISMAILI", fontSize = 10.sp)
            }
        }

    }

}

@Preview
@Composable
fun preview_Classes() {
    Classes_Screen()
    
}