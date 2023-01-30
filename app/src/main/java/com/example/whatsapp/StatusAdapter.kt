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

class StatusAdapter(context: Context?, person: Array<String>, time: Array<String>, img: IntArray) :
    RecyclerView.Adapter<StatusAdapter.DataHolder>() {

    var context = context
    var person = person
    var time = time
    var img = img

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {

        var view =LayoutInflater.from(context).inflate(R.layout.status_recycle_layout, parent, false)

        return DataHolder(view)
    }

    override fun getItemCount(): Int {

        return person.size
    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {

        holder.status_user_name.setText(person.get(position))
        holder.status_time.setText(time.get(position))
        context?.let { Glide.with(it).load(img[position]).into(holder.img_status) }

    }

    class DataHolder(itemView: View) : ViewHolder(itemView) {

        var img_status = itemView.findViewById<ImageView>(R.id.imgStatus)
        var status_user_name = itemView.findViewById<TextView>(R.id.status_user_text)
        var status_time = itemView.findViewById<TextView>(R.id.Status_recycle_text)
    }
}
