package com.example.otvalboshki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otvalboshki2)
    }
    val button = findViewById<Button>(R.id.button)

    .setOnClickListener {
        startActivity(Intent(this, Otvalboshki3::class.java))
    }
}

