package com.example.edward.dinnerdecide

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonDecide.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            textViewFood.text = foodList[randomFood]
        }

        buttonAddFood.setOnClickListener {
            if (editTextAddFood.text.isEmpty()){
                Toast.makeText(this, "Please enter a food!", Toast.LENGTH_SHORT).show()
            } else {
                foodList.add(editTextAddFood.text.toString())
                editTextAddFood.text.clear()
                Log.v("FoodList", "$foodList")
            }
        }
    }
}
