package com.example.ga

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
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
fun Registration(
    navController: NavHostController
) {

    Surface(
        modifier = Modifier.fillMaxSize()
    ) {


        Box(modifier =  Modifier.fillMaxSize()){
            Image(painter = painterResource(id = R.drawable.rfon),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )


            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 40.dp)
            ) {

                Image(painter = painterResource(id = R.drawable.logowhite),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .height(200.dp)
                        .width(200.dp)
                        .padding(bottom = 30.dp)
                )

                Text(text = "Вход",
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight(800),
                        color = Color.White,
                        textAlign = TextAlign.Center

                    ),
                    modifier = Modifier

                        .padding(bottom = 30.dp)
                )

                Text("Войдите, чтобы восстановить свои прошлые данные!",
                    style = TextStyle(
                        fontSize = 15.sp,
                        fontFamily = fontFamily,
                        color = Color(0xFFF2F5C0),
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier
                        .padding(bottom = 30.dp)
                )


                CTextField(hint = "Email", value = "")

                CTextField(hint = "Пароль", value = "")

                Spacer(modifier = Modifier.height(50.dp))

                CButton(text = "Войти")

                DontHaveAccountRow(
                    onSignupTap = {
                        navController.navigate("signup")
                    }
                )

            }

        }

    }

}


@Preview(showBackground = true, widthDp = 320, heightDp = 640)
@Composable
fun LoginScreenPreview() {
    Welcome(rememberNavController())
}