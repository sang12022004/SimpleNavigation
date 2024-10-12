package com.example.simplenavigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Login.router
    ){
        composable(
            route = Screen.Login.router
        ){
            LoginScreen(navController)
        }
        composable(
            route = Screen.Register.router
        ){
            RegisterScreen(navController)
        }
    }
}