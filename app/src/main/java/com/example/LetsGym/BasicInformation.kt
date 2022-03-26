package com.example.LetsGym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class BasicInformation : AppCompatActivity() {
    val sex = arrayOf("Female","Male")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_information)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val setDeviceBut = findViewById(R.id.setDeviceButton) as ImageButton
        val  btnRetMenu = findViewById(R.id. btnRetMenu) as ImageView
        val  btnNextBasic = findViewById(R.id. btnNextBasic) as Button

        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,sex)
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, view: View?, position: Int, p3: Long) {
                Toast.makeText(applicationContext,"selected:"+sex[position],Toast.LENGTH_SHORT)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        setDeviceBut.setOnClickListener {
            val intent = Intent(this, SetDevice::class.java)
            // start your next activity
            startActivity(intent)
        }

        btnRetMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
        btnNextBasic.setOnClickListener {
            val intent = Intent(this, LetsGymMenu::class.java)
            // start your next activity
            startActivity(intent)
        }

    }

}