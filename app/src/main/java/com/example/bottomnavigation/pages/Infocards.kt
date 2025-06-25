package com.example.bottomnavigation.pages


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
fun InfoCard(
    title: String,
    status: String,
    description: String,
    onClick: ()-> Unit,
    modifier: Modifier = Modifier
) {
    Column ( modifier = modifier.clip(RoundedCornerShape(8.dp))
        .background(color = Color(0xFF008080))
        .padding(16.dp).height(210.dp),
        verticalArrangement = Arrangement.SpaceEvenly) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        )
        {
            Text(text = title, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 30.sp)
            Surface (color = Color.Transparent, contentColor = Color(0xFF008080)) {
                Row (modifier = Modifier
                    .clip(RoundedCornerShape(50))
                    .background(color = Color.White)
                    .clickable {  }
                    .padding(horizontal = 12.dp)
                ){
                    Text("Create a new Goal")
                    Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, null)
                }

            }

        }
        Text(status,
            style = MaterialTheme.typography.titleLarge, color = Color.White)
        Text( description , color = Color.White)
    }

}




