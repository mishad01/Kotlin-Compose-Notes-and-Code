package com.example.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.screens.home.HomeScreen
import com.example.movieapp.screens.details.DetailsScreen

@Composable
fun MovieNavigation() {
    // Create a NavController to handle navigation between screens
    val navController = rememberNavController()

    // Set up the navigation host with a start destination
    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name) {

        // Composable for the HomeScreen
        composable(MovieScreens.HomeScreen.name) {
            // Display the HomeScreen and pass the NavController to it
            HomeScreen(navController)
        }

        // Composable for the DetailsScreen
        //www.google.com/detail-screen/id=34
        // The route accepts a 'movie' argument in the URL path (e.g., /DetailsScreen/{movie})
        composable(
            MovieScreens.DetailsScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") { type = NavType.StringType })
        ) { backStackEntry ->
            // Extract the 'movie' argument from the back stack entry and pass it to the DetailsScreen
            DetailsScreen(
                navController = navController,
                backStackEntry.arguments?.getString("movie")
            )
        }
    }
}
