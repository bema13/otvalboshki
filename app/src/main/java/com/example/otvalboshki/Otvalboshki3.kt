package com.example.otvalboshki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Otvalboshki3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otvalboshki3)
    }
    val button1 = findViewById<Button>(R.id.button3)

    .setOnClickListener {
        startActivity(Intent(this, Otvalboshki5::class.java))
    }
}
