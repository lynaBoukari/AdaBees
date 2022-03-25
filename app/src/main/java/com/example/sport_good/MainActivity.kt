package com.example.sport_good

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnWorkMode = findViewById(R.id.btnWorkMode) as ImageButton
        btnWorkMode.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}