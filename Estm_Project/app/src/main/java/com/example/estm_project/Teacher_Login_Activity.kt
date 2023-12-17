package com.example.estm_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estm_project.compose.Teacher_Login_Screen
import com.example.estm_project.ui.theme.Estm_ProjectTheme

class Teacher_Login_Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Estm_ProjectTheme {
                // A surface container using the 'background' color from the theme
                val emailValue = remember { mutableStateOf("") }
                val passwordValue = remember { mutableStateOf("") }

                val passwordVisibility = remember { mutableStateOf(false) }

                Box(modifier = Modifier.fillMaxSize().background(Color.White), contentAlignment = Alignment.BottomCenter){
//

                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally ,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(8.68f)
                            .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 60.dp))
                            .background(Color.White)
                            .padding(10.dp)
                    ){

                        Text(text = "DSIC Classroom",
                            style =  TextStyle(
                                fontWeight = FontWeight.Bold,
                                letterSpacing = 2.sp
                            ),
                            fontSize = 40.sp)
                        Spacer(modifier = Modifier.height(24.dp))


                        Text(
                            text = "TSign in",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                letterSpacing = 2.sp
                            ),
                            fontSize = 38.sp
                        )
                        Spacer(modifier = Modifier.padding(20.dp))

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ){
                            OutlinedTextField(
                                value = emailValue.value,
                                onValueChange = {emailValue.value = it},
                                label = { Text(text = "Academic Email ") },
                                placeholder = { Text(text = "Email Address") },
                                singleLine = true,
                                modifier = Modifier.fillMaxWidth(8.8f)
                            )
                            OutlinedTextField(

                                value = passwordValue.value,
                                onValueChange = {passwordValue.value = it},
                                trailingIcon = {
                                    IconButton(onClick = {
                                        passwordVisibility.value = !passwordVisibility.value
                                    }) {
//                            Icon(painter = painterResource(id = R.drawable.password_eye),
//                                tint = if (passwordVisibility.value) Color.White else Color.Gray,
//                                contentDescription = "eye password")
                                    }
                                },
                                label = { Text("Password") },
                                placeholder = { Text("Password") },
                                singleLine =  true,
                                visualTransformation = if (passwordVisibility.value) VisualTransformation.None
                                else PasswordVisualTransformation(),
                                modifier = Modifier.fillMaxWidth(8.8f)

                            )
                            Spacer(modifier = Modifier.padding(10.dp))
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth(8.8f)
                                    .height(50.dp)
                            ) {
                                Text(text = "Sign in",
                                    fontSize = 23.sp)

                            }
                            Spacer(modifier = Modifier.padding(20.dp))

                        }
                    }

                }
            }
        }
    }
}
