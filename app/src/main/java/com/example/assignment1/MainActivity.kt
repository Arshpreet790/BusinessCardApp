package com.example.assignment1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1.ui.theme.Assignment1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardDesign(
                        fullName = "Arshpreet",
                        title = "Student in software development",
                        mobile = "82589033505",
                        social = "AndroidDev",
                        email = "arshpreet@gmail.com"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardDesign (fullName: String, title:String, mobile:String, social:String,
                        email:String, modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFd2e8d4))
    ) {
        Column (modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
            .align(Alignment.Center),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier
            .size(104.dp)
            .background(Color(0xFF073042)),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter= painterResource(id = R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier.padding(8.dp)
            )
        }
        Text(
            text = fullName,
            modifier = Modifier.padding(vertical = 8.dp),
            fontSize = 35.sp
        )
            Text(
                text =title,
               fontSize = 14.sp,
           fontWeight = FontWeight.Bold,
                color = Color(0xFF006d3b)
            )
    }

       Column (
           modifier = Modifier
               .padding(horizontal = 16.dp, vertical = 16.dp)
               .width(IntrinsicSize.Max)
               .align(Alignment.BottomCenter),
           verticalArrangement = Arrangement.Center,
           horizontalAlignment = Alignment.CenterHorizontally
           ) {
           Row (
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(bottom = 4.dp),
               horizontalArrangement = Arrangement.Center,
               verticalAlignment = Alignment.CenterVertically
           ){
               Icon(
                   Icons.Default.Call,
                   contentDescription = "phone",
                   modifier= Modifier.padding(end=16.dp),
                   tint= Color(0xFF006d3b)
               )
               Text(
                   text = mobile,
                   modifier = Modifier.fillMaxWidth()
               )
           }
           Row(
               modifier = Modifier
                   .padding(bottom= 4.dp)
                   .fillMaxWidth(),
               horizontalArrangement = Arrangement.Center,
               verticalAlignment = Alignment.CenterVertically
           ){
               Icon(
                   Icons.Default.Share,
                   contentDescription = "social",
                   modifier= Modifier.padding(end=16.dp),
                   tint= Color(0xFF006d3b)
               )
               Text(
                   text = social,
                   modifier = Modifier.fillMaxWidth()
               )
           }
           Row(
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(bottom= 4.dp),
               horizontalArrangement = Arrangement.Center,
               verticalAlignment = Alignment.CenterVertically
           ){
               Icon(
                   Icons.Default.Email,
                   contentDescription = "email",
                   modifier= Modifier.padding(end=16.dp),
                   tint= Color(0xFF006d3b)
               )
               Text(
                   text = email,
                   modifier = Modifier.fillMaxWidth()
               )
           }
       }




    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment1Theme {
        BusinessCardDesign(fullName = "Arshpreet",
            title = "Student in software development",
            mobile = "8258833505",
            social = "Social@social",
            email = "arshpreet@gmail.com")
    }
}