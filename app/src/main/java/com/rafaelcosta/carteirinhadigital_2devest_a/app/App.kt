package com.rafaelcosta.carteirinhadigital_2devest_a.app

import androidx.compose.runtime.Composable
import com.rafaelcosta.carteirinhadigital_2devest_a.app.navigation.AppNavHost
import com.rafaelcosta.carteirinhadigital_2devest_a.core.designsystem.theme.CarteirinhaDigital_2DEVESTATheme

@Composable
fun App() {
    CarteirinhaDigital_2DEVESTATheme {
        AppNavHost()
    }
}