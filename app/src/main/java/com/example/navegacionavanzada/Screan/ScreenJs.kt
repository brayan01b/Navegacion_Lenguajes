package com.example.navegacionavanzada.Screan

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navegacionavanzada.R


@Composable

fun ScreenJs(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffffeb46))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text="Java Script",fontSize = 50.sp, color = Color.Blue)
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp),
            painter = painterResource(id = R.drawable.javas),
            contentDescription = "Imagen"
        )
        Text(text="JavaScript es un lenguaje de programación de alto nivel, interpretado y orientado a objetos. Es conocido por su capacidad para crear aplicaciones web interactivas. JavaScript es ampliamente utilizado en el desarrollo de aplicaciones web, aplicaciones móviles, aplicaciones de escritorio y aplicaciones científicas.",fontSize = 20.sp)
        Spacer(modifier = Modifier.height(26.dp))

        Button(onClick = {

            navController.navigate("ScreenPrincipal")
        }) {
            Text("Ir al Inicio ")
        }
    }
}
