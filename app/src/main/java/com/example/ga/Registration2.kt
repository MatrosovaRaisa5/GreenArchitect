package com.example.ga

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ga.components.CButton
import com.example.ga.components.CTextField
import com.example.ga.components.DontHaveAccountRow
import com.example.ga.ui.theme.fontFamily

@Composable
fun Registration2(navController: NavHostController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Surface(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.rfon),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.fillMaxSize().padding(horizontal = 40.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logowhite),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 30.dp).height(200.dp).width(200.dp).padding(bottom = 30.dp)
                )

                Text(
                    text = "Регистрация",
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight(800),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier.padding(bottom = 30.dp)
                )

                Text(
                    "Зарегистрируйтесь, чтобы получить каталог растений!",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = fontFamily,
                        textAlign = TextAlign.Center,
                        color = Color(0xFFF2F5C0)
                    ),
                    modifier = Modifier.padding(bottom = 30.dp)
                )
                CTextField(hint = "Имя", value = name, onValueChange = { name = it })
                CTextField(hint = "Email", value = email, onValueChange = { email = it })
                CTextField(hint = "Пароль", value = password, onValueChange = { password = it })

                Spacer(modifier = Modifier.height(50.dp))

                CButton(text = "Зарегистрироваться",
                onClick = {
                    navController.navigate("map")
                }
                )

                Row(modifier = Modifier.padding(top=12.dp, bottom=52.dp)) {
                    Text(
                        "Уже есть аккаунт?",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontFamily = fontFamily,
                            color = Color.White
                        )
                    )

                    Text(
                        " Войти",
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontFamily = fontFamily,
                            fontWeight = FontWeight(800),
                            color = Color.White
                        ),
                        modifier = Modifier.clickable {
                            navController.navigate("login")
                        }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun SignupScreenPreview() {
    Registration2(rememberNavController())
}