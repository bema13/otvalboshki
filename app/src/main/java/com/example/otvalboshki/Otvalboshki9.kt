package com.example.otvalboshki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Otvalboshki9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otvalboshki9)
    }
    val button = findViewById<Button>(R.id.button10)

    .setOnClickListener {
        startActivity(Intent(this, Otvalboshki10::class.java))
    }

}
