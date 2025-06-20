package com.example.bottomnavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.bottomnavigation.pages.Homepage
import com.example.bottomnavigation.pages.NotificationPage
import com.example.bottomnavigation.pages.ProfilePage
import com.example.bottomnavigation.pages.Settingspage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier){
    val navItemList = listOf(
        NavItem("Home", Icons.Default.Home),
        NavItem("Notifications", Icons.Default.Notifications),
        NavItem("Settings", Icons.Default.Settings),
        NavItem("Profile", Icons.Default.Person)
    )
    var selectedIndex by remember {
        mutableIntStateOf(0)
    }
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = rememberTopAppBarState()
    )
    Scaffold(
        modifier = Modifier.fillMaxSize(),

        bottomBar ={
            NavigationBar()
            {
                navItemList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index ,
                        onClick ={
                            selectedIndex =index
                        },
                        icon ={ Icon(imageVector =navItem.icon ,contentDescription ="Icon") },
                        label ={
                            Text(text = navItem.label)
                        },
                    )
                }



            }

        }
    ) { innerPadding ->
        ContentScreen(modifier= Modifier.padding(innerPadding),selectedIndex)

    }
}
@Composable
fun ContentScreen(modifier: Modifier= Modifier, selectedIndex: Int){
    when(selectedIndex){
        0-> Homepage()
        1-> NotificationPage()
        2-> Settingspage()
        3-> ProfilePage()
    }

}
