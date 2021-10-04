package com.example.rollingdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var diceOneImg : ImageView
    private lateinit var diceTwoImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceOneImg = findViewById(R.id.dice_number)
        diceTwoImg = findViewById(R.id.dice_number1)

        val rollButton = findViewById<Button>(R.id.roll)

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {

        val image1 = when((1..6).random()){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice1
        }

        val image2 = when((1..6).random()){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice1
        }

        diceOneImg.setImageResource(image1)
        diceTwoImg.setImageResource(image2)
    }
}