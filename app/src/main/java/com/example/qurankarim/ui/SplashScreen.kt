package com.example.qurankarim.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.qurankarim.R
import com.example.qurankarim.Route
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(3000L)
        navController.navigate(Route.QuranListScreen.route) {
            popUpTo(Route.SplashScreen.route) {
                inclusive = true
            }
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "My Qur'an",
            color = Color.Red,
            fontSize = 32.sp,
            fontStyle = FontStyle.Italic
        )
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_background),
            contentDescription = "",
            modifier = Modifier.width(500.dp)
        )
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth()
                .width(
                    50.dp
                ),

            )
        Image(
            painter = painterResource(id = R.drawable.ic_quran_logo),
            contentDescription = "",
            modifier = Modifier.width(200.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun SplashPreview() {
   SplashScreen(rememberNavController())
}