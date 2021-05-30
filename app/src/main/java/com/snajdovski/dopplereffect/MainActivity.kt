package com.snajdovski.dopplereffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

// Experimentation with JetPack Compose and Kotlin on Android, using Android Studio 2020.3.1 Artic Fox Beta 3
//30 May 2021 snajdovski, stefannajdovski
//Learning about modifiers such as .border, .padding, ...
// More about Doppler Effect on https://en.wikipedia.org/wiki/Doppler_effect

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Doppler Effect
            Column( //Column (up & down), Row (left & right)
                modifier =
                Modifier
                    .fillMaxHeight() //fills the screen Height
                    .fillMaxWidth() //fills the screen Width
                    .background(Color.Black)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.Black, RectangleShape)
                    .padding(5.dp)
                    .border(5.dp, Color.White, RectangleShape)
                    .padding(5.dp)

            ) {
                //Empty for a reason
            }
        }
    }
}
