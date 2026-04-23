package com.rafaelcosta.carteirinhadigital_2devest_a.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rafaelcosta.carteirinhadigital_2devest_a.app.navigation.Routes
import com.rafaelcosta.carteirinhadigital_2devest_a.feature.carteirinha.presentation.CarteirinhaScreen
import com.rafaelcosta.carteirinhadigital_2devest_a.feature.auth.presentation.LoginScreen
import com.rafaelcosta.carteirinhadigital_2devest_a.core.designsystem.theme.CarteirinhaDigital_2DEVESTATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}
