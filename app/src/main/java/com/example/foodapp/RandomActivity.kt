package com.example.huouapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.foodapp.R
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var button: Button

    val cardImages: IntArray = intArrayOf(
        R.drawable.banhtrang,
        R.drawable.xoailac,
        R.drawable.toboki,
        R.drawable.châng,
        R.drawable.suachua,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.random_monan)
        imageView = findViewById(R.id.imageView)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            var random = Random
            imageView.setImageResource(cardImages[random.nextInt(cardImages.size)])
        }
    }
}