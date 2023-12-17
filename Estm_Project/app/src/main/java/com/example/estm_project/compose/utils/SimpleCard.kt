package com.example.estm_project.compose.utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estm_project.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleCard(profName:String,annonce:String,date:String,number:String){
    val commentaireValue = remember { mutableStateOf("") }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(6.dp)
            .height(220.dp)
            .width(500.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White, //Card background color
            contentColor = Color.White  //Card content color,e.g.text
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(6.dp),
            verticalArrangement = Arrangement.Top
        ) {
            // Row containing the Image and Text
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                // Image with reduced size
                Surface(
                    modifier = Modifier
                        .height(40.dp)
                        .width(40.dp), shape = CircleShape, color = Color(0xffe8bd3d)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = profName.get(0).toString(), textAlign = TextAlign.Center,
                            color = Color.White)

                    }

                }
                Spacer(modifier = Modifier.width(7.dp))

                // Column for text content
                Column(
                    modifier = Modifier.weight(2f),
                    verticalArrangement = Arrangement.Top
                ) {
                    Surface(
                        shape = RoundedCornerShape(24.dp),
                        modifier = Modifier.wrapContentSize(),
                        color = Color(0xFFD1D5E1)
                    ) {

                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = profName,
                        fontSize = 18.sp,
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.SemiBold

                    )

                    Spacer(modifier = Modifier.height(1.dp))

                    Text(text = date,color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 13.sp,)

                    Spacer(modifier = Modifier.height(2.dp))

                    // ... Rest of your content
                }
            }

            Spacer(modifier = Modifier.height(12.dp))


            // Regular text area above the OutlinedTextField
            Row {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = annonce,
                    fontSize = 17.sp,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 0.dp, horizontal = 0.dp)
                )
            }
            // Small text area with icon below the OutlinedTextField
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp, horizontal = 0.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                Icon(
                    painter = painterResource(id = R.drawable.ic_file),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.size(16.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "$number piéce jointe",
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurface,
                )
            }

            // OutlinedTextField beneath the image
            OutlinedTextField(
                value = commentaireValue.value,
                onValueChange = { commentaireValue.value = it },
                label = { Text(text = "Ajouter un commentaire ici") },
                placeholder = { Text(text = "Ajouter un commentaire ici") },
                textStyle = TextStyle(
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurface
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp, horizontal = 0.dp)
            )



            // ... Other content
        }
    }
}

@Preview
@Composable
fun preview() {
    SimpleCard("Lahcen Hasnaoui Moualy","Pas de cours demain","11 December","2")

}