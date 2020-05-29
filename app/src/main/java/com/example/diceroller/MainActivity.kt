package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.ImageView
class MainActivity : AppCompatActivity() {
    lateinit var dice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.roll_button)
        val but:Button=findViewById(R.id.reset_button)
        rollbutton.setOnClickListener{
                rolldice()
            }
        dice=findViewById(R.id.image)
       reset_button.setOnClickListener{roll_die()}

    }
    public fun roll_die()
    {
        dice.setImageResource(R.drawable.dice_1)
    }
/*    public fun change_text()
    {
        Toast.makeText(this,"reset done",Toast.LENGTH_SHORT).show()
        val changetext:TextView=findViewById(R.id.text_view)
        changetext.text=(0).toString()
    }*/
    public fun rolldice()
    {
        Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
    //    val res_text:TextView=findViewById(R.id.text_view)
      //  res_text.text="dice rolled!"
        val random_int:Int=(1..6).random()
        //res_text.text=random_int.toString()
        //val dice: ImageView=findViewById(R.id.image)
        val drawableResource=when(random_int){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
           else->R.drawable.dice_6
        }
        dice.setImageResource(drawableResource)
    }

}
