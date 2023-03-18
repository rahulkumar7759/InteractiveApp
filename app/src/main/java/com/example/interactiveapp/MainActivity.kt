package com.example.interactiveapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var buttonDark=findViewById<Button>(R.id.btnDark)
        var buttonRead=findViewById<Button>(R.id.btnRead)
        val layout=findViewById<LinearLayout>(R.id.linearLayout)

        buttonRead.setOnClickListener {
            // change the light mode
            layout.setBackgroundResource(R.color.green)
        }

        buttonDark.setOnClickListener {
            // change the color
            layout.setBackgroundResource(R.color.black)
        }

    }
}