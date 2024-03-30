package com.example.radiolab5

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.media.AudioAttributes
import android.view.View
import android.widget.Button
import androidx.compose.runtime.Composable

var url1 = "http://stream.whus.org:8000/whusfm"
var url2 = "http://stream.whus.org:8000/whusfm"
var url3 = "http://stream.whus.org:8000/whusfm"
var url4 = "http://stream.whus.org:8000/whusfm"
var url5 = "http://stream.whus.org:8000/whusfm"




class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer1: MediaPlayer
    private lateinit var mediaPlayer2: MediaPlayer
    private lateinit var mediaPlayer3: MediaPlayer
    private lateinit var mediaPlayer4: MediaPlayer
    private lateinit var mediaPlayer5: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

}

@Composable
fun



