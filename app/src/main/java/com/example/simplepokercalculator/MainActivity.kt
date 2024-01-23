package com.example.simplepokercalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count: Int = 0
        val countTextView: TextView = findViewById(R.id.count)
        countTextView.text = "" + count
        val myButton: Button = findViewById(R.id.button)
        myButton.setOnClickListener(){
            count++
            if(count > 33){
                count = 0
            }
            countTextView.text = "" + count
        }
    }
}