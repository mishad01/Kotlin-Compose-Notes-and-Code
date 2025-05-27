package com.example.movieapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieapp.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp { innerPadding -> // MyApp now provides innerPadding
                MainContent(modifier = Modifier.padding(innerPadding)) // Apply padding
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(content: @Composable (PaddingValues) -> Unit) {
    MovieAppTheme {
        Scaffold(topBar = {
            TopAppBar(
                title = { Text("Movies") },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primaryContainer)
            )
        }) { innerPadding ->
            content(innerPadding)
        }
    }
}

@Composable
fun MainContent(
    modifier: Modifier = Modifier, movieList: List<String> = listOf(
        "Avatar",
        "300",
        "Harry Potter",
        "Happiness",
        "Life",
        "Avatar",
        "300",
        "Harry Potter",
        "Happiness",
        "Life"
    )
) {
    Column(modifier = modifier.padding(12.dp)) {
        LazyColumn {
            items(items = movieList) {
                MovieRow(it)
            }
        }
    }
}

@Composable
fun MovieRow(movie: String) {
    Card(
        modifier = Modifier
            .padding((4.dp))
            .fillMaxWidth()
            .height(130.dp),
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = CardDefaults.elevatedCardElevation(6.dp)

    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Surface(modifier = Modifier
                .padding(12.dp)
                .size(100.dp), shape = RectangleShape) {
                Icon(imageVector = Icons.Default.AccountBox, contentDescription = "Movie Image")
            }
            Text(movie)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp {
        MyApp { innerPadding ->
            MainContent(modifier = Modifier.padding(innerPadding))
        }
    }
}