package com.example.radiolab5.model

import android.media.MediaPlayer
import android.widget.Button

data class Radio (
    val id: Int,
    val radioName: String,
    val radioImage: Int,
    val radioUrl: String,
    var radioOn: Boolean = false,
    var mediaPlayer: MediaPlayer
)