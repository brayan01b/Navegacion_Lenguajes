package com.example.navegacionavanzada.Screan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ScreenPrincipal(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD3D3D3))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Navega por los siguientes lenguajes de programación",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(16.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))
Button(onClick = {
        // Navegar a ScreenB
        navController.navigate("ScreenC")
}) {
    Text("Ir a C++")
}
        Spacer(modifier = Modifier.height(26.dp))

        Button(onClick = {
            // Navegar a ScreenB
            navController.navigate("ScreenJa")
        }) {
            Text("Ir a Java")
        }

        Spacer(modifier = Modifier.height(26.dp))

        Button(onClick = {
            // Navegar a ScreenB
            navController.navigate("ScreenJs")
        }) {
            Text("Ir a JavaScript")
        }
        Spacer(modifier = Modifier.height(26.dp))

        Button(onClick = {
            // Navegar a ScreenB
            navController.navigate("ScreenKo")
        }) {
            Text("Ir a Kotlin")
        }
        Spacer(modifier = Modifier.height(26.dp))

        Button(onClick = {
            // Navegar a ScreenB
            navController.navigate("ScreenMySql")
        }) {
            Text("Ir a MySql")
        }
}}