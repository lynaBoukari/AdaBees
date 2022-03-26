package com.example.LetsGym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ConditionMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_condition_menu)

        val  btnRetLets = findViewById(R.id. btnRetLets) as ImageView

        btnRetLets.setOnClickListener {
            val intent = Intent(this, LetsGymMenu::class.java)
            // start your next activity
            startActivity(intent)
        }
        val  btnYes = findViewById(R.id.btnYes) as Button


    }
}