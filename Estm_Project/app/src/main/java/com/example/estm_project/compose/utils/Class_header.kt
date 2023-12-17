package com.example.estm_project.compose.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Class_header(className:String,color: Color) {
    val commentaireValue = remember { mutableStateOf("") }
    Column() {
        Card(
            onClick = {
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp)
                .height(120.dp)
                .width(500.dp),
            colors = CardDefaults.cardColors(
                containerColor = color, //Card background color
                contentColor = Color.White  //Card content color,e.g.text
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                Modifier
                    .padding(16.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Bottom
            ) {
                Column() {
                    Text(className, fontSize = 22.sp)
                    Spacer(Modifier.height(4.dp))
                    Text("LP-DSIC", fontSize = 13.sp)
                    Spacer(Modifier.height(8.dp))

                }

            }
        }
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .height(66.dp)
            .width(500.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White, //Card background color
                contentColor = Color.White  //Card content color,e.g.text
            ),) {

            Surface(
                Modifier
                    .fillMaxSize()
                    .padding(5.dp)) {
                Row(
                    Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(Modifier.width(8.dp))
                    Surface(
                        modifier = Modifier
                            .height(40.dp)
                            .width(40.dp), shape = CircleShape, color = Color(0xff2f4241
                        )
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(text = "M", textAlign = TextAlign.Center, color = Color.White)

                        }

                    }
                    Spacer(Modifier.width(2.dp))
                    Surface(
                        Modifier
                            .fillMaxSize()
                            .paddingFromBaseline(bottom = 15.dp)) {
                        TextField(

                            value = commentaireValue.value,
                            onValueChange = { commentaireValue.value = it },
                            placeholder = { Text(text = "Announce something to your class", fontSize = 14.sp) },
                            colors = TextFieldDefaults.textFieldColors(
                                containerColor = Color.White,
                                unfocusedIndicatorColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent
                            ),
                            textStyle = TextStyle(
                                fontSize = 14.sp,
                                color = Color.White
                            ),

                            modifier = Modifier
                                .fillMaxWidth()

                        )
                    }

                }
            }

        }
    }


}

@Preview
@Composable
fun Class_header_preview() {
    Class_header("English",Color.Blue)


}