package com.rafaelcosta.carteirinhadigital_2devest_a.feature.auth.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.rafaelcosta.carteirinhadigital_2devest_a.app.navigation.Routes
import com.rafaelcosta.carteirinhadigital_2devest_a.feature.auth.presentation.LoginScreen

fun NavGraphBuilder.authScreen(
    navController: NavController
) {
    composable(Routes.Login) {
        LoginScreen(
            navController = navController
        )
    }
}