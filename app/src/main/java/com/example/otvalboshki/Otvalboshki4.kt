package com.example.otvalboshki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Otvalboshki4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otvalboshki4)
    }
    val button3 = findViewById<Button>(R.id.button3)

    .setOnClickListener {
        startActivity(Intent(this, Otvalboshki5::class.java))
    }
}
