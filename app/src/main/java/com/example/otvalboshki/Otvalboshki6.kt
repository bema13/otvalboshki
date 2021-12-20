package com.example.otvalboshki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Otvalboshki6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otvalboshki6)
    }
    val button = findViewById<Button>(R.id.button6)

    .setOnClickListener {
        startActivity(Intent(this, Otvalboshki8::class.java))
    }
}
