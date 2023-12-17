package com.example.estm_project.compose.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PeopleScreen(prof:String) {
    Surface(
        Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(color = Color.White)
    ) {
        Column {
            Text(text = "Teacher", fontSize = 22.sp, color = Color.Blue)
            Spacer(modifier = Modifier.height(15.dp))
            Divider(thickness = 2.dp, color = Color.Blue)
            Spacer(modifier = Modifier.height(15.dp))
            Person(prof, color = Color(0xffe8bd3d))
            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Classmates",fontSize = 22.sp, color = Color.Blue)
            Spacer(modifier = Modifier.height(15.dp))
            Divider(thickness = 2.dp, color = Color.Blue)
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "AMAL SALMI", color = Color(0xff66023c))
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "AYOUB ELOUAIZI", color = Color(0xffacace6))
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "EL BAHIA TAIMOURIA",color= Color(0xfff27d52))
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "ELMAHDI AMARJANE",color = Color(0xff8e8e8e))
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "HAITAM BELCAIDA",color= Color(0xff191970))
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "HAJAR BAHNAS",color = Color(0xffe0b0ff))
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "HAMZA EL BARRAK",color = Color(0xff66023c))
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "HANANE AIT-LHAJ",color=Color(0xff5f5f5f))
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "HIND CHENFOUR",color = Color(0xffabd434))
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "KAMAL HAMIDI",color=Color(0xff022c44))
            Spacer(modifier = Modifier.height(15.dp))
            Person(name = "ZAKARIA LAKHDAR",color = Color(0xffb5a79b))

        }
    }

}

@Preview(showBackground = true)
@Composable
fun People_prev() {
    PeopleScreen("LAHCEN HASNAOUI MOULAY")

}