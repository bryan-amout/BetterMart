package com.example.bettermart.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.BetterMart.ui.theme.screens.login.LoginScreen
import com.example.bettermart.ui.theme.screens.about.AboutScreen
import com.example.bettermart.ui.theme.screens.addproducts.AddclothingScreen
import com.example.bettermart.ui.theme.screens.addproducts.AddelectronicsScreen
import com.example.bettermart.ui.theme.screens.addproducts.AddfoodstuffScreen
import com.example.bettermart.ui.theme.screens.addproducts.AddfurnitureScreen
import com.example.bettermart.ui.theme.screens.addproducts.AddkitchenwareScreen
import com.example.bettermart.ui.theme.screens.addproducts.AddpersonaleffectsScreen
import com.example.bettermart.ui.theme.screens.addproducts.AddstationeryScreen
import com.example.bettermart.ui.theme.screens.addproducts.AddtoysScreen

import com.example.bettermart.ui.theme.screens.admin.AdminScreen
import com.example.bettermart.ui.theme.screens.admin.AdminloginScreen
import com.example.bettermart.ui.theme.screens.dashboard.DashboardScreen
import com.example.bettermart.ui.theme.screens.signup.SignupScreen
import com.example.bettermart.ui.theme.screens.splash.SplashScreen
import com.example.bettermart.ui.theme.screens.viewproducts.ViewclothingScreen
import com.example.bettermart.ui.theme.screens.viewproducts.ViewelectronicsScreen
import com.example.bettermart.ui.theme.screens.viewproducts.ViewfoodstuffScreen
import com.example.bettermart.ui.theme.screens.viewproducts.ViewfurnitureScreen
import com.example.bettermart.ui.theme.screens.viewproducts.ViewkitchenwareScreen
import com.example.bettermart.ui.theme.screens.viewproducts.ViewpersonaleffectsScreen
import com.example.bettermart.ui.theme.screens.viewproducts.ViewstationeryScreen
import com.example.bettermart.ui.theme.screens.viewproducts.ViewtoysScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
    }


        composable(ROUT_LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(ROUT_ADMINLOGIN) {
            AdminloginScreen(navController = navController)
        }
        composable(ROUT_ADMIN) {
            AdminScreen(navController = navController)
        }
        composable(ROUT_SIGNUP) {
            SignupScreen(navController = navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController = navController)
        }
        composable(ADD_CLOTHING_URL) {
            AddclothingScreen(navController = navController)
        }
        composable(ADD_ELECTRONICS_URL) {
            AddelectronicsScreen(navController = navController)
        }
        composable(ADD_FOODSTUFF_URL) {
            AddfoodstuffScreen(navController = navController)
        }
        composable(ADD_FURNITURE_URL) {
            AddfurnitureScreen(navController = navController)
        }
        composable(ADD_KITCHENWARE_URL) {
            AddkitchenwareScreen(navController = navController)
        }
        composable(ADD_PERSONALEFFECTS_URL) {
            AddpersonaleffectsScreen(navController = navController)
        }
        composable(ADD_STATIONERY_URL) {
            AddstationeryScreen(navController = navController)
        }
        composable(ADD_TOYS_URL) {
            AddtoysScreen(navController = navController)
        }
        composable(VIEW_CLOTHING_URL) {
            ViewclothingScreen(navController = navController)
        }
        composable(VIEW_ELECTRONICS_URL) {
            ViewelectronicsScreen(navController = navController)
        }
        composable(VIEW_FOODSTUFF_URL) {
            ViewfoodstuffScreen(navController = navController)
        }
        composable(VIEW_FURNITURE_URL) {
            ViewfurnitureScreen(navController = navController)
        }
        composable(VIEW_KITCHENWARE_URL) {
            ViewkitchenwareScreen(navController = navController)
        }
        composable(VIEW_PERSONALEFFECTS_URL) {
            ViewpersonaleffectsScreen(navController = navController)
        }
        composable(VIEW_STATIONERY_URL) {
            ViewstationeryScreen(navController = navController)
        }
        composable(VIEW_TOYS_URL) {
            ViewtoysScreen(navController = navController)
        }
}}
