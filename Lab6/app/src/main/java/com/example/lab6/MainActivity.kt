package com.example.lab6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab6.ui.theme.Lab6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab6Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Greeting("Greetings! Welcome to Radio + Audio App!")
                        createRow()
                        createRowVideo()
                    }
                }
            }
        }
    }
}

@Composable
fun createRow() {
    Row() {
        Text(
            text = "Calvin Harris",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 30.dp)
        )

        Button(onClick = {

        }) {
            Text("Play")
        }

        Button(onClick = {

        }) {
            Text("Stop")
        }
    }
}

@Composable
fun createRowVideo() {
    Row() {
        Text(
            text = "Calvin Harris Video",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 30.dp)
        )

        Button(onClick = {

        }) {
            Text("Play")
        }

        Button(onClick = {

        }) {
            Text("Stop")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab6Theme {
        Greeting("Android")
    }
}