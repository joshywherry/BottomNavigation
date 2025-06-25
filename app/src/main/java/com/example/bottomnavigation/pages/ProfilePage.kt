package com.example.bottomnavigation.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.*
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfilePage(modifier: Modifier) {
    val progress = 0.6f
    val currentWeight = 63
    val desiredWeight = 67
    val height = "5.6"

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape),
            tint = Color.Gray)

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Joshua Were",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold)

        Text(
            text = "joshuawere@gmail.com",
            fontSize = 16.sp,
            color = Color.Gray)

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF008080),
                contentColor = Color.White
            )) {
            Text("Edit Profile")
        }

        Spacer(modifier = Modifier.height(50.dp))

        OutlinedButton(onClick = { }) {
            Text("Logout", color = Color(0xFF008080))
        }

        Spacer(modifier = Modifier.height(50.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(color = Color(0xFF008080))) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.Start) {

                Text(
                    text = "Current Weight: $currentWeight",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)

                Text(
                    text = "Desired Weight: $desiredWeight",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)

                Text(
                    text = "Height: $height",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)

                Text(
                    text = "Progress Toward Goal",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp)

                LinearProgressIndicator(
                progress = { progress },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(10.dp),
                color = Color.Green,)
            }
        }
    }
}
