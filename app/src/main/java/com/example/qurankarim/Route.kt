package com.example.qurankarim

sealed class Route(val route: String) {
    object SplashScreen: Route(route = "splashscreen")
    object QuranListScreen: Route(route = "quran_list_screen")
}