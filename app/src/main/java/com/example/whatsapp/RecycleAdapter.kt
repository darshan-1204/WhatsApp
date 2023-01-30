package com.example.whatsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide

class RecycleAdapter(context: Context?,person: Array<String>,text: Array<String>,time: Array<String>,img: IntArray)
    : RecyclerView.Adapter<RecycleAdapter.DataHolder>() {

    var context = context
    var person = person
    var text = text
    var time = time
    var img = img

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {

        var view = LayoutInflater.from(context).inflate(R.layout.recycle_layout,parent,false)

        return DataHolder(view)
    }

    override fun getItemCount(): Int {

        return person.size

    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {

        holder.user_name.text = person[position]
        holder.message.text = text[position]
        holder.time.text = time[position]
        context?.let { Glide.with(it).load(img[position]).into(holder.img) }

    }

    class DataHolder(itemView: View) : ViewHolder(itemView) {

        var img: ImageView = itemView.findViewById<ImageView>(R.id.img)!!
        var user_name = itemView.findViewById<TextView>(R.id.text_recycle)
        var message = itemView.findViewById<TextView>(R.id.second_recycle_text)
        var time = itemView.findViewById<TextView>(R.id.time)

    }
}