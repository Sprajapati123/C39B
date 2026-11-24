package com.example.c39b

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c39b.ui.theme.C39BTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginBody()
        }
    }
}

@Composable
fun LoginBody() {


    var email by remember() { mutableStateOf("") }
    var password by remember() { mutableStateOf("") }

    var visibility by remember() { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {

        Text(
            "Sign In", style = TextStyle(
                fontSize = 24.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 70.dp, bottom = 10.dp),
            textAlign = TextAlign.Center
        )

        Text(
            "Welcome back to application",
            style = TextStyle(
                fontSize = 17.sp,
                color = Color.Gray,
            ),
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 15.dp,
                    vertical = 20.dp
                )
        ) {
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Blue.copy(alpha = 0.1f)
                ),
                modifier = Modifier
                    .height(70.dp)
                    .weight(1f)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painterResource(R.drawable.fb),
                        contentDescription = null,
                        modifier = Modifier.size(40.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        "Facebook", style = TextStyle(
                            fontSize = 17.sp
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.width(15.dp))
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.Blue.copy(alpha = 0.1f)
                ),
                modifier = Modifier
                    .height(70.dp)
                    .weight(1f)
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painterResource(R.drawable.google),
                        contentDescription = null,
                        modifier = Modifier.size(40.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        "Google", style = TextStyle(
                            fontSize = 17.sp
                        )
                    )
                }
            }


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            HorizontalDivider(modifier = Modifier.weight(1f))
            Text("Or", modifier = Modifier.padding(horizontal = 10.dp))
            HorizontalDivider(modifier = Modifier.weight(1f))
        }

        OutlinedTextField(
            value = email,
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Blue.copy(alpha = 0.1f),
                focusedContainerColor = Color.Blue.copy(alpha = 0.1f),
                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Transparent
            ),
            placeholder = {
                Text("abc@gmail.com")
            },
            onValueChange = {
                email = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = password,
            visualTransformation = if (visibility) {
                PasswordVisualTransformation()
            } else {
                VisualTransformation.None

            },

            trailingIcon = {
                IconButton(onClick = {
                    visibility = !visibility
                }) {
                    Icon(
                        painterResource(
                            if (visibility) {
                                R.drawable.baseline_visibility_24
                            } else {
                                R.drawable.baseline_visibility_off_24
                            }

                        ),
                        contentDescription = null
                    )
                }

            },
            colors = TextFieldDefaults.colors(
                unfocusedContainerColor = Color.Blue.copy(alpha = 0.1f),
                focusedContainerColor = Color.Blue.copy(alpha = 0.1f),
                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Transparent
            ),
            placeholder = {
                Text("*******")
            },
            onValueChange = {
                password = it
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        )

    }

}

@Preview
@Composable
fun LoginPreview() {
    LoginBody()
}