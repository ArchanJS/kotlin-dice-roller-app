package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class Dice(val sides:Int){
    fun roll():Int{
        return (1..sides).random();
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button =findViewById(R.id.button);
        btn.setOnClickListener {
            val currDice=Dice(6)
            val diceImg:ImageView=findViewById(R.id.imageView)
            val result=currDice.roll()
            when(result){
                1->diceImg.setImageResource(R.drawable.dice_1)
                2->diceImg.setImageResource(R.drawable.dice_2)
                3->diceImg.setImageResource(R.drawable.dice_3)
                4->diceImg.setImageResource(R.drawable.dice_4)
                5->diceImg.setImageResource(R.drawable.dice_5)
                6->diceImg.setImageResource(R.drawable.dice_6)
            }
        }
    }
}