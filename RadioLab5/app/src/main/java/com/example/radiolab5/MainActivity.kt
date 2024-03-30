package com.example.radiolab5

import android.media.AudioAttributes
import android.media.Image
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.radiolab5.utils.Constants
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.example.radiolab5.utils.Constants.getRadioList
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.ui.unit.sp


class MainActivity : AppCompatActivity() {

    private lateinit var radioList: MutableList<com.example.radiolab5.model.Radio>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        radioList = getRadioList()

        setContent {
            Text(
                text = "Your Top 5 Radios ",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )
            radioColumnList()
        }
    }

    fun setUpRadio(radio: MediaPlayer, url: String) {
        radio.apply {
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
            setDataSource(url)
            prepare()
        }
    }


    @Composable
    fun radioColumnList() {
        Column(modifier = Modifier.padding(vertical = 60.dp)) {
            radioList.forEach {radio ->
                createRow(model = radio)
            }
        }
    }

    @Composable
    fun createRow(model: com.example.radiolab5.model.Radio) {

        Row() {
            Image(
                painter = painterResource(id = model.radioImage),
                contentDescription = model.radioName,
                contentScale = ContentScale.Fit
            )

            Text(
                text = model.radioName,
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

}

