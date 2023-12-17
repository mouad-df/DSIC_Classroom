package com.example.estm_project.tab

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.estm_project.compose.MyClasses.English
import com.example.estm_project.compose.MyClasses.Gestion_de_projet
import com.example.estm_project.compose.MyClasses.Mobile
import com.example.estm_project.compose.MyClasses.Uml
import com.example.estm_project.compose.utils.No_Homework
import com.example.estm_project.compose.utils.PeopleScreen

typealias ComposableFun = @Composable ()-> Unit
sealed class TabItem_Gestion(val title:String, val icon: ImageVector, val screens:ComposableFun) {
    object Home :TabItem_Gestion("Stream", icon = Icons.Default.List, screens ={ Gestion_de_projet()} )
    object HomeWork :TabItem_Gestion("Project ", icon = Icons.Default.DateRange, screens ={ No_Homework() } )
    object People :TabItem_Gestion("People", icon = Icons.Default.Person, screens ={ PeopleScreen("LAHCEN HASNAOUI MOULAY") } )

}
sealed class TabItem_Mobile(val title:String, val icon: ImageVector, val screens:ComposableFun) {
    object Home :TabItem_Gestion("Stream", icon = Icons.Default.List, screens ={ Mobile() } )
    object HomeWork :TabItem_Gestion("Project ", icon = Icons.Default.DateRange, screens ={ No_Homework() } )
    object People :TabItem_Gestion("People", icon = Icons.Default.Person, screens ={ PeopleScreen("ZAKARIAA AIT ELMOUDEN") } )

}
sealed class TabItem_Uml(val title:String, val icon: ImageVector, val screens:ComposableFun) {
    object Home :TabItem_Gestion("Stream", icon = Icons.Default.List, screens ={ Uml() } )
    object HomeWork :TabItem_Gestion("Project ", icon = Icons.Default.DateRange, screens ={ No_Homework() } )
    object People :TabItem_Gestion("People", icon = Icons.Default.Person, screens ={ PeopleScreen("ALAE EL AMLAMI") } )

}

sealed class TabItem_English(val title:String, val icon: ImageVector, val screens:ComposableFun) {
    object Home :TabItem_Gestion("Stream", icon = Icons.Default.List, screens ={ English() } )
    object HomeWork :TabItem_Gestion("Project ", icon = Icons.Default.DateRange, screens ={ No_Homework() } )
    object People :TabItem_Gestion("People", icon = Icons.Default.Person, screens ={ PeopleScreen("JALAL ISAMILI") } )

}