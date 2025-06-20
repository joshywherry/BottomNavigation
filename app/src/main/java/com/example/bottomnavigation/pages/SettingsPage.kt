package com.example.bottomnavigation.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


@Composable
fun Settingspage( modifier: Modifier){
    Column (modifier = Modifier.fillMaxSize()
        .background(Color(0xFF673AB7)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            "Settings",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}
