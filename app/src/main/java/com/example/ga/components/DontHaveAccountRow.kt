package com.example.ga.components

import com.example.ga.ui.theme.fontFamily

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DontHaveAccountRow(
    onSignupTap: () -> Unit = {},
) {
    Row(
        modifier = Modifier.padding(top=20.dp, bottom = 50.dp)
    ){
        Text("Нет аккаунта? ",
            style = TextStyle(
                fontSize = 15.sp,
                fontFamily = fontFamily,
                color = Color.White
            )
        )

        Text("Регистрация",
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight(800),
                color = Color.White
            ),
            modifier = Modifier.clickable {
                onSignupTap()
            }
        )


    }
}