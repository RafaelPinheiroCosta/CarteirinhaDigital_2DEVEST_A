package com.rafaelcosta.carteirinhadigital_2devest_a.feature.auth.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rafaelcosta.carteirinhadigital_2devest_a.app.navigation.Routes
import com.rafaelcosta.carteirinhadigital_2devest_a.core.designsystem.theme.CarteirinhaDigital_2DEVESTATheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var login by remember { mutableStateOf("") };

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Login")
        TextField(
            value = login,
            onValueChange = {login = it},
            label = { Text("email") }
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("senha") }
        )
        Button(
            onClick = {
                navController.navigate(Routes.Carteirinha)
            },

            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            ),
            modifier = Modifier
                .width(200.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(
                width = 4.dp,
                color = MaterialTheme.colorScheme.onPrimary
            )
        ) {
            Text("Entrar")
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun LoginScreenPreview() {
    CarteirinhaDigital_2DEVESTATheme {
        //LoginScreen()
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun LoginScreenPreviewDark() {
    CarteirinhaDigital_2DEVESTATheme(
        darkTheme = true
    ) {
        //LoginScreen()
    }
}