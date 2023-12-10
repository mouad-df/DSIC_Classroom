package com.example.estm_project

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estm_project.ui.theme.Estm_ProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Estm_ProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface (modifier = Modifier.fillMaxSize().background(Color.White)){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White)
                            .padding(10.dp)
                    ) {
                        Spacer(modifier = Modifier.height(60.dp))

                        Text(
                            text = "DSIC Classroom",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                letterSpacing = 2.sp
                            ),
                            fontSize = 40.sp
                        )

                        Spacer(modifier = Modifier.height(60.dp))


                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White)
                                .padding(10.dp)
                        ) {
                            Button(
                                onClick ={
                                    val navigate = Intent(this@MainActivity,Student_Login_Activity::class.java)
                                    startActivity(navigate)
                                },
                                modifier = Modifier
                                    .height(50.dp)
                            ) {
                                Text(
                                    text = "Log in as Student",
                                    fontSize = 23.sp
                                )

                            }
                            Spacer(modifier = Modifier.height(24.dp))
                            Button(
                                onClick = {
                                    val navigate = Intent(this@MainActivity,Teacher_Login_Activity::class.java)
                                    startActivity(navigate)
                                },
                                modifier = Modifier
                                    .height(50.dp)
                            ) {
                                Text(
                                    text = "Log in as Teacher",
                                    fontSize = 23.sp
                                )

                            }
                        }

                    }
                }

            }
        }
    }
}

