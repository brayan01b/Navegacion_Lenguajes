package com.example.navegacionavanzada.Screan

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
@Composable
fun navigationExample() {
val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ScreenPrincipal") {
        composable("screenKo") {
            ScreenKo(navController)
        }
        composable("screenJa") {
            ScreenJa(navController )
        }
        composable("screenMySql") {
            ScreenMySql(navController )

        }
        composable("screenC") {
            ScreenC(navController )
    }
        composable("screenPrincipal") {
            ScreenPrincipal(navController )
        }
        composable("screenJs") {
            ScreenJs(navController )
        }
}}