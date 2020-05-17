package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice_btn: Button = findViewById(R.id.dice_btn)
        dice_btn.setOnClickListener{

            //Toast.makeText(this, "Dice rolled", Toast.LENGTH_SHORT).show()
            rollDice()
        }


    }

    private fun rollDice() {
        val dice_count: ImageView = findViewById(R.id.dice_count)
        val rand_num = Random.nextInt(6)+1  //random.nextInt(6 ) gives numbers from 0 to 5, i.e less than 6
        val drawable_resource = when (rand_num)
        {
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        dice_count.setImageResource(drawable_resource)

    }
}
