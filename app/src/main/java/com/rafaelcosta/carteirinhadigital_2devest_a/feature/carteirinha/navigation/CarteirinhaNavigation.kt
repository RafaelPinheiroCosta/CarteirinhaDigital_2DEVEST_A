package com.rafaelcosta.carteirinhadigital_2devest_a.feature.carteirinha.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.rafaelcosta.carteirinhadigital_2devest_a.app.navigation.Routes
import com.rafaelcosta.carteirinhadigital_2devest_a.feature.auth.presentation.LoginScreen
import com.rafaelcosta.carteirinhadigital_2devest_a.feature.carteirinha.presentation.CarteirinhaScreen

fun NavGraphBuilder.carteirinhaScreen(
    onNavigateToLogin: () -> Unit
) {
    composable(Routes.Carteirinha) {
        CarteirinhaScreen(
            onBackClick = onNavigateToLogin
        )
    }
}