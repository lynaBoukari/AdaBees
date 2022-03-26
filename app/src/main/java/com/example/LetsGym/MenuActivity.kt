package com.example.LetsGym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val btnLetsGym = findViewById(R.id.btnLetsGym) as Button

        btnLetsGym.setOnClickListener {
            val intent = Intent(this, BasicInformation::class.java)
            // start your next activity
            startActivity(intent)
        }

        val btnRetMain = findViewById(R.id.btnRetMain) as ImageView
        btnRetMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}