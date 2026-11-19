package com.example.c39b

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c39b.ui.theme.C39BTheme
import com.example.c39b.ui.theme.Red
import com.example.c39b.ui.theme.White

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainBody()
        }
    }
}

@Composable
fun MainBody() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White),
        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
//                .padding(start = 5.dp, end = 10.dp, top = 12.dp, bottom = 15.dp),
//                .padding(horizontal = 10.dp, vertical = 8.dp),
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
//           Icons.Arrow_Back
            Icon(
                painterResource(R.drawable.baseline_arrow_back_ios_24),
                contentDescription = "Back"
            )
            Text(
                "sandis2026", style = TextStyle(
                    fontWeight = FontWeight.W700,
                    color = Red,
//                color = Red.copy(0.1f),
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Italic,
                    textDecoration = TextDecoration.Underline,
//                textAlign = TextAlign.Right
                )
            )
            Icon(
                painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
            )

        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painterResource(R.drawable.apple),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("170")
                Text("Posts")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("1M")
                Text("Followers")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("800")
                Text("Followings")
            }


        }
        //bio
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Text("sandis001")
            Text("this is description")
            Text("works at softwarica")
        }

        ElevatedButton(onClick = {}) {
            Text("Follow")
        }

        //story highlights
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {

        }
    }


}

@Preview
@Composable
fun MainPreview() {
    MainBody()
}