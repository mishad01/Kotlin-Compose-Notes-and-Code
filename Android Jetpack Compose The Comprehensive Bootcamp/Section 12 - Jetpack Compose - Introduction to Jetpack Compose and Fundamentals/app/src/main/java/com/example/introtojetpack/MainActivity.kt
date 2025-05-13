package com.example.introtojetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.introtojetpack.ui.theme.IntroToJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntroToJetpackTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    MyApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyApp(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(), color = Color.DarkGray
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Number Increment",
                color = Color.White,
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize =22.sp )
            )
            Spacer(modifier = Modifier.height(80.dp))
            CircleButton()
        }
    }
}

@Composable
fun CircleButton() {
    val count =  remember {
        mutableStateOf(0)
    }
    Card(
        modifier = Modifier
            .padding(3.dp)
            .size(105.dp).clickable {
                count.value+=1
            },
        shape = CircleShape,
        colors = CardDefaults.cardColors(
            Color.Gray
        )

    ) {
        Box(
            modifier = Modifier.fillMaxSize(), // 👈 This makes it fill the card
            contentAlignment = Alignment.Center
        ) {
            Text(text = count.value.toString(), modifier = Modifier,)
        }
    }
}