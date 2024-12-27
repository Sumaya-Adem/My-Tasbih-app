package com.example.mytasbiih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countTextView = findViewById<TextView>(R.id.countTextView)
        val countButton = findViewById<Button>(R.id.countButton)
        val resetButton = findViewById<Button>(R.id.resetButton)

        countButton.setOnClickListener {
            count++
            countTextView.text = count.toString()
        }

        resetButton.setOnClickListener {
            count = 0
            countTextView.text = count.toString()
        }
    }
}