package com.rafaelcosta.carteirinhadigital_2devest_a.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.rafaelcosta.carteirinhadigital_2devest_a.feature.auth.navigation.authScreen
import com.rafaelcosta.carteirinhadigital_2devest_a.feature.carteirinha.navigation.carteirinhaScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Login
    ) {
        authScreen(
            onNavigateToCarteirinha = {
                navController.navigate(Routes.Carteirinha)
            }
        )

        carteirinhaScreen(
            onNavigateToLogin = {
                navController.navigate(Routes.Login)
            }
        )
    }
}