package com.example.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var minus = findViewById<Button>(R.id.decrement_button)
        var text = findViewById<TextView>(R.id.textview)
        var plus = findViewById<Button>(R.id.increment_button)
        var count = 0
        var value = text
        minus.setOnClickListener {
            if(count <=0 ) count = 0
             else count--
            value.text = ""+count
        }
        plus.setOnClickListener {
            count++
            value.text = ""+count
        }
    }
}