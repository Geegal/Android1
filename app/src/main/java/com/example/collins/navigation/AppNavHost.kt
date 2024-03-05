package com.example.collins.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.collins.screens.cities.CitiesScreen
import com.example.collins.screens.destinations.DestinationScreen
import com.example.collins.screens.home.HomeScreen
import com.example.collins.ui.theme.screens.Main.mainscreen
import com.example.collins.ui.theme.screens.categories.attractions
import com.example.collins.ui.theme.screens.contact.Contactscreen
import com.example.collins.ui.theme.screens.landin.Firstscreen
import com.example.collins.ui.theme.screens.location.LocationScreen
import com.example.collins.ui.theme.screens.login.LoginScreen
import com.example.collins.ui.theme.screens.products.AddProductsScreen
import com.example.collins.ui.theme.screens.products.ViewProductsScreen
import com.example.collins.ui.theme.screens.signup.SignupScreen
import com.example.collins.ui.theme.screens.start.SplashScreenn

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(ADD_PRODUCTS_URL){
            AddProductsScreen(navController = navController)
        }
        composable(VIEW_PRODUCTS_URL){
            ViewProductsScreen(navController = navController)
        }
        composable(SPLASH_URL){
            SplashScreenn(navController = navController)
        }

        composable(FIRST_URL){
            Firstscreen(navController = navController)
        }

        composable(MAIN_URL){
            mainscreen(navController = navController)
        }
        composable(CONTACT_URL){
            Contactscreen(navController = navController)
        }
        composable(CATEGORIES_URL){
            attractions(navController = navController)
        }
        composable(WILDLIFE_URL){
            attractions(navController = navController)
        }
        composable(HERITAGE_URL){
            attractions(navController = navController)
        }
        composable(CITIES_URL){
            CitiesScreen(navController = navController)
        }
        composable(DESTINATION_URL){
            DestinationScreen(navController = navController)
        }
        composable(LOCATION_URL){
            LocationScreen(navController = navController)
        }
    }
}