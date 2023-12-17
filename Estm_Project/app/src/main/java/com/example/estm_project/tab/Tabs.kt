package com.example.estm_project.tab

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import com.google.accompanist.pager.PagerState

import androidx.compose.material.Icon
import androidx.compose.material.LeadingIconTab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class, ExperimentalPagerApi::class)
@Composable
fun Tabs(tabs:List<TabItem_Gestion>, pagerState: PagerState) {

    val scope = rememberCoroutineScope(

    )
    TabRow(selectedTabIndex = pagerState.currentPage,
        Modifier.background(Color(0xffaaf0d1)),
        indicator = {tabPositions ->
            Modifier.pagerTabIndicatorOffset(pagerState = pagerState, tabPositions = tabPositions)

        }
        ) {
        tabs.forEachIndexed { index, tabItem -> 
            LeadingIconTab(
                selected = pagerState.currentPage == index,
                onClick = { scope.launch {
                    pagerState.animateScrollToPage(index)
                }},
                text = { Text(text = tabItem.title) },
                icon = { Icon(imageVector = tabItem.icon,
                    contentDescription =null )}
            )
        }

    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun GestionProject_MainContent() {
    val list = listOf(TabItem_Gestion.Home,TabItem_Gestion.HomeWork,TabItem_Gestion.People)
    val pagerState = rememberPagerState()
    Column(Modifier.fillMaxSize()) {
        Tabs(tabs = list, pagerState = pagerState)
        TabContent(tabs = list, pagerState =pagerState )
    }
    
}
@OptIn(ExperimentalPagerApi::class)
@Composable
fun Mobile_MainContent() {
    val list = listOf(TabItem_Mobile.Home,TabItem_Mobile.HomeWork,TabItem_Mobile.People)
    val pagerState = rememberPagerState()
    Column(Modifier.fillMaxSize()) {
        Tabs(tabs = list, pagerState = pagerState)
        TabContent(tabs = list, pagerState =pagerState )
    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Uml_MainContent() {
    val list = listOf(TabItem_Uml.Home,TabItem_Uml.HomeWork,TabItem_Uml.People)
    val pagerState = rememberPagerState()
    Column(Modifier.fillMaxSize()) {
        Tabs(tabs = list, pagerState = pagerState)
        TabContent(tabs = list, pagerState =pagerState )
    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun English_MainContent() {
    val list = listOf(TabItem_English.Home,TabItem_English.HomeWork,TabItem_English.People)
    val pagerState = rememberPagerState()
    Column(Modifier.fillMaxSize()) {
        Tabs(tabs = list, pagerState = pagerState)
        TabContent(tabs = list, pagerState =pagerState )
    }

}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun TabContent(tabs: List<TabItem_Gestion>, pagerState: PagerState) {
    HorizontalPager(count = tabs.size, state = pagerState) {page ->
        tabs[page].screens()
    }

}

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun Tabs_prev() {
    GestionProject_MainContent()
}
