package com.example.LetsGym

import android.content.Context
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val onItemClicked: (position: Int) -> Unit, val context: Context, var data:List<Device>): RecyclerView.Adapter<ListAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.device_layout, parent, false),onItemClicked)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.apply {
            name.text = data[position].name
            image.setImageResource(data[position].image)
            state.setImageResource(data[position].state)
        }


    }
    override fun getItemCount() = data.size

    class MyViewHolder(
        view: View,
        private val onItemClicked: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(view), View.OnClickListener {
        val name = view.findViewById (R.id.name) as TextView
        val image = view.findViewById(R.id.image) as ImageView
        val state = view.findViewById(R.id.state) as ImageView
        init {
            itemView.setOnClickListener(this)
        }
        override fun onClick(v: View) {
            val position = adapterPosition
            onItemClicked(position)
        }
    }
}