package com.example.sport_good

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LetsGymMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lets_gym_menu)
        val btnEvery = findViewById(R.id.btnEvery) as Button
        val btnFour = findViewById(R.id.btnFour) as Button
        val btnTwice = findViewById(R.id.btnTwice) as Button
        btnEvery.setOnClickListener {
            val intent = Intent(this, ConditionMenu::class.java)
            // start your next activity
            startActivity(intent)
        }
        btnFour.setOnClickListener {
            val intent = Intent(this, ConditionMenu::class.java)
            // start your next activity
            startActivity(intent)
        }
        btnTwice.setOnClickListener {
            val intent = Intent(this, ConditionMenu::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}