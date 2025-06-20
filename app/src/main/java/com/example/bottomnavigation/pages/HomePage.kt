package com.example.bottomnavigation.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Homepage( modifier: Modifier){
    LazyColumn (
        modifier = modifier.padding(top = 20.dp, start = 12.dp, end =  12.dp)
            .clip(RoundedCornerShape(8.dp)),
        verticalArrangement = Arrangement.spacedBy(24.dp)){
        item {
            InfoCard(
                title = "Your Current Weight",
                status = "63 Kg",
                description = "Your Dream Weight",
                onClick = {}
            )
        }
        item {
            InfoCard(
                title = "Today's Steps Count",
                status = " 3000 Steps",
                description = "Your Daily steps Progress",
                onClick = {}
            )
        }
        item {
            InfoCard(
                title = "Calories Burnt Today",
                status = "237 Kcal",
                description = "Your Today's Progress",
                onClick = {}
            )

        }
        item {
            InfoCard(
                title = "Your meal Plan Today",
                status = "1368 kcal",
                description = "Amount of calories ",
                onClick = {}
            )

        }
    }
}
