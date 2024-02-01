package com.example.lab1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1.ui.theme.Lab1Theme

const val TAG_VALUE = "DSY_TAG"

class MainActivity : ComponentActivity() {
    // Create Instance
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG_VALUE, "in onCreate")
    }

    // Start Instance
    override fun onStart() {
        super.onStart()
        Log.i(TAG_VALUE, "in onStart")
    }

    // Pause Instance
    override fun onPause() {
        super.onPause()
        Log.i(TAG_VALUE, "in onPause")
    }

    // Resume Instance
    override fun onResume() {
        super.onResume()
        Log.i(TAG_VALUE, "in onResume")
    }

    // Stop Instance
    override fun onStop() {
        super.onStop()
        Log.i(TAG_VALUE, "in onStop")
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
    Lab1Theme {
        Greeting("Android")
    }
}