package com.anvi.cineverse.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.anvi.cineverse.screens.DetailScreen
import com.anvi.cineverse.screens.FavoritesScreen
import com.anvi.cineverse.screens.HomeScreen
import com.anvi.cineverse.screens.SplashScreen

@Composable
fun CineVerseNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "splash"
    ) {

        composable("splash") {
            SplashScreen(navController)
        }

        composable("home") {
            HomeScreen(navController)
        }

        composable("details/{movieTitle}") { backStackEntry ->

            val movieTitle =
                backStackEntry.arguments?.getString("movieTitle") ?: ""

            DetailScreen(
                navController = navController,
                movieTitle = movieTitle
            )
        }

        composable("favorites") {
            FavoritesScreen()
        }

    }

}