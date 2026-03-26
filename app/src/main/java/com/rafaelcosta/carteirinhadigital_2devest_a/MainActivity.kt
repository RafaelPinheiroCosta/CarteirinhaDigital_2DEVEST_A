package com.rafaelcosta.carteirinhadigital_2devest_a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rafaelcosta.carteirinhadigital_2devest_a.ui.theme.CarteirinhaDigital_2DEVESTATheme
import com.rafaelcosta.carteirinhadigital_4devm_t1.feature.carteirinha.presentation.component.QrCode

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigital_2DEVESTATheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteirinhaDigitalApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }


    }
}

@Composable
fun CarteirinhaDigitalApp(modifier: Modifier = Modifier) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.fundo),
            contentDescription = "Fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Carteirinha Digital",
                modifier = Modifier
                    .size(250.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.login),
                contentDescription = "Foto do Aluno",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(
                        width = 4.dp,
                        color = Color.Red,
                        CircleShape
                    )
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "nome:",
                    fontSize = 15.sp,
                )
                Text(
                    text = "Rafael Costa",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "curso:",
                    fontSize = 15.sp,
                )
                Text(
                    text = "Desenvolvimento de Sistemas",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            QrCode(
                "seunumerodematriculaaqui",
                modifier = Modifier
                    .border(
                        4.dp,
                        Color.Red
                    )
            )
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun CarteirinhaDigitalAppPreview() {
    CarteirinhaDigital_2DEVESTATheme {
        CarteirinhaDigitalApp()
    }
}

