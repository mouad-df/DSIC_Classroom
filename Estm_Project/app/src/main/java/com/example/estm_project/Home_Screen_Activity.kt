package com.example.estm_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings

import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.estm_project.compose.MyClasses.Classes_Screen
import com.example.estm_project.compose.MyClasses.Mobile
import com.example.estm_project.compose.MyClasses.Uml
import com.example.estm_project.tab.English_MainContent
import com.example.estm_project.tab.GestionProject_MainContent
import com.example.estm_project.tab.Mobile_MainContent
import com.example.estm_project.tab.Uml_MainContent
import com.example.estm_project.ui.theme.Estm_ProjectTheme
import kotlinx.coroutines.launch

class Home_Screen_Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Estm_ProjectTheme {
                // A surface container using the 'background' color from the theme
                NavDrawer()
            }
        }
    }
}

val screenList :List<@Composable ()-> Unit> = listOf(
    { Classes_Screen() },
    {},
    { GestionProject_MainContent() },{ Mobile_MainContent()},{ Uml_MainContent()},{English_MainContent()}
)
val drawerItem = listOf(
    DrawerItems(Icons.Default.Face, "Gestion de Projet 2023", "G", Color(0xFF7d7eec), prof = "LAHCEN HASNAOUI MOULAY"),
    DrawerItems(Icons.Filled.Email, "DSIC5-Developement Mobile", "D", Color(0xFFc48b9b), prof = "ZAKARIAA AIT ELMOUDEN"),
    DrawerItems(Icons.Filled.Favorite, "UML 23/24", "U", Color(0xFFf8ad9d), prof = "ALAE EL ALAMI"),
    DrawerItems(Icons.Filled.Settings, "English for ICT", "E", Color(0xFF6c6377), prof = "JALAL ISMAILI")
)
var screenIndex: MutableState<Int> = mutableStateOf(0)
//var screenSelected =mutableStateOf(screenList[screenIndex])

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavDrawer() {


    val drawerItem2 = listOf(
        DrawerItems2(Icons.Default.Home, "Classes", ),
        DrawerItems2(Icons.Default.Person, "Profile",),

    )
    val bigDrawer= listOf(
        drawerItem,drawerItem2
    )
    var selectedItem by remember {
        mutableStateOf(bigDrawer[1][0])
    }






//    var selectedItem2 by remember {
//        mutableStateOf(drawerItem2[0])
//    }
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerContent = {
        ModalDrawerSheet {

            Column(Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Spacer(modifier = Modifier.height(12.dp))
                    Row(horizontalArrangement = Arrangement.Center) {
                        Text(text = "DSIC Classroom", textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            fontSize = 26.sp)

                    }
                drawerItem2.forEach{
                    NavigationDrawerItem(
                        label = { Text(text = it.text) },
                        selected = it == selectedItem,
                        onClick = {
                            selectedItem = it
                            if (it.text == "Classes"){
                                println("screenIndex $screenIndex")
                                screenIndex.value = 0
                            }

                            if (it.text == "Profile"){
                                println("screenIndex $screenIndex")
//                                delay(500)
                                screenIndex.value = 1
                            }
                            scope.launch {
                                drawerState.close()
                            }
                        },
                        modifier = Modifier.padding(horizontal = 16.dp),
                        icon = {
                            Icon(imageVector = it.icon, contentDescription = it.text)
                        }
                        )
                }
                Divider(
                    Modifier.align(Alignment.CenterHorizontally), thickness = 1.dp,
                    Color.LightGray
                )
                drawerItem.forEach{
                    NavigationDrawerItem(label = { Text(text = it.text) }
                        , selected = it == selectedItem
                        , onClick = {
                            if (it.seconText== "G"){
                                println("screenIndex $screenIndex")
                                screenIndex.value = 2
                            }

                            if (it.seconText == "D"){
                                println("screenIndex $screenIndex")
//                                delay(500)
                                screenIndex.value = 3
                            }
                            if (it.seconText == "U"){
                                println("screenIndex $screenIndex")
//                                delay(500)
                                screenIndex.value = 4
                            }
                            if (it.seconText == "E"){
                                println("screenIndex $screenIndex")
//                                delay(500)
                                screenIndex.value = 5
                            }
                            selectedItem = it
                            scope.launch {
                                drawerState.close()
                            }
                        },
                        modifier = Modifier.padding(horizontal = 16.dp)
                        , icon = {
                            Surface(modifier= Modifier
                                .height(40.dp)
                                .width(40.dp)
                                , shape = CircleShape, color = it.color) {
                                Column(verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally) {
                                    Text(text = it.seconText, textAlign = TextAlign.Center, color = Color.White)

                                }

                            }
//                            Icon(imageVector = it.icon, contentDescription = it.text)
                        }
                        ,
                    )
                }


            }
        }
    }, drawerState = drawerState) {

        Scaffold(

            topBar = {
            TopAppBar(
                colors= TopAppBarDefaults.topAppBarColors(containerColor = Color.White),
                title = { Text(text = "Classroom", textAlign = TextAlign.Center) },
                navigationIcon = {
                    IconButton(onClick = {
                        scope.launch {

                            drawerState.open()
                        }
                    }) {
                        Icon(imageVector = Icons.Filled.Menu, contentDescription = "menu Icon")
                    }

                }
            )
        }) {
            paddingValues ->
                Surface(
                    Modifier
                        .fillMaxSize()
                        .absolutePadding(top = 80.dp)) {
                    Surface {
                        LazyColumn(content = {
                            items(1){
                                index -> screenList[screenIndex.value]()
                            }
                        })
//                        screenSelected

                    }

                }




        }


    }
}
data class DrawerItems(
    val icon: ImageVector,
    val text:String,
    val seconText:String,
    val color:Color,
    val prof:String,
)

data class DrawerItems2(
    val icon: ImageVector,
    val text:String,
    
)

