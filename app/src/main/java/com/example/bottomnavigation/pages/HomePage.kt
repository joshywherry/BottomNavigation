package com.example.bottomnavigation.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Homepage( ){
    LazyColumn (modifier = Modifier.padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)){
        item {
            InfoCard(
                title = "Weekly Goal",
                status = "N/A",
                description = "You haven't created any goals yet",
                onClick = {}
            )
        }
        item {
            InfoCard(
                title = "Current Steps Count",
                status = "52.7 k",
                description = "Your current steps Progress",
                onClick = {}
            )
        }
        item {
            InfoCard(
                title = "Weekly Goal",
                status = "N/A",
                description = "You haven't created any goals yet",
                onClick = {}
            )
        }
    }
}
