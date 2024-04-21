package com.example.afinal

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.afinal.model.Met
import com.example.afinal.ui.theme.FinalTheme
import com.example.afinal.util.Constants
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {

    private lateinit var metList: MutableList<Met>
    private val TAG = "MyActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        metList = Constants.getListOfMetModel()
        setContent {
            var metCounter by remember { mutableStateOf(0) }

            FinalTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column (
                        verticalArrangement = Arrangement.spacedBy(
                            space = 10.dp,
                            alignment = Alignment.CenterVertically
                        ),
                        horizontalAlignment = Alignment.CenterHorizontally ) {
                        val currentMetModel = metList[metCounter]
                        Card (
                            modifier = Modifier.size(300.dp),
                            shape = RectangleShape,

                        ) {
                            Image(painter = rememberAsyncImagePainter(model = currentMetModel.metImage),
                                contentDescription = "MET",
                                contentScale = ContentScale.FillBounds)
                        }

                        Text(
                            text = currentMetModel.metImageTitle
                        )

                        Button(onClick = {
                            metCounter++
                            if (metCounter > 4) {
                                metCounter = 0
                            }
                            Log.i(TAG, "nextButton: ${metCounter}")

                        }) {
                            Text(
                                text = "Next MET Image"
                            )
                        }

                        Button(onClick = {
                            metCounter--
                            if (metCounter < 0) {
                                metCounter = 4
                            }
                            Log.i(TAG, "nextButton: ${metCounter}")

                        }) {
                            Text(
                                text = "Previous MET Image"
                            )
                        }
                    }
                }
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    FinalTheme {
//        Greeting("Android")
//    }
//}

// API: https://collectionapi.metmuseum.org/public/collection/v1/objects/{number}