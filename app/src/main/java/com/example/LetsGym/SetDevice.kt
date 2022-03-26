package com.example.LetsGym

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SetDevice : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_device)
        val recyclerView = findViewById(R.id.deviceList) as RecyclerView
        val btnRetSetUp = findViewById(R.id.btnRetSetUp) as ImageView
        val layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = ListAdapter({ position -> onClickDevice(position)},this,loadData())

        btnRetSetUp.setOnClickListener {
            val intent = Intent(this, BasicInformation::class.java)
            // start your next activity
            startActivity(intent)
        }
    }


    fun loadData():List<Device> {
        val data = mutableListOf<Device>()
        data.add(Device(R.drawable.ic_standbyme,"StandByME",R.drawable.state_device))
        data.add(Device(R.drawable.smart_tv1,"Smart Tv",R.drawable.state_device))
        data.add(Device(R.drawable.air_conditioner,"StandByME",R.drawable.state_device))
        return data
    }
    private fun onClickDevice(position: Int) {
    }
}