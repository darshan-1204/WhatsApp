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

class CallsAdapter(context: Context?, person: Array<String>, time: Array<String>, img: IntArray) : RecyclerView.Adapter<CallsAdapter.DataHolder>() {

    var context = context
    var person = person
    var time = time
    var img = img


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {


        var view =LayoutInflater.from(context).inflate(R.layout.calls_recycle_layout, parent, false)

        return DataHolder(view)
    }

    override fun getItemCount(): Int {

        return  person.size
    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {

        holder.UserCall.setText(person.get(position))
        holder.time.setText(time.get(position))
        context?.let { Glide.with(it).load(img.get(position)).into(holder.imgCall) }
    }

    class DataHolder(itemView: View) : ViewHolder(itemView) {

        var imgCall = itemView.findViewById<ImageView>(R.id.imgCall)
        var UserCall = itemView.findViewById<TextView>(R.id.calls_user_text)
        var time = itemView.findViewById<TextView>(R.id.calls_recycle_text)
    }
}
