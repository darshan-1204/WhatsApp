package com.example.whatsapp

import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.whatsapp.Fragments.CallsFragment
import com.example.whatsapp.Fragments.ChatFragment
import com.example.whatsapp.Fragments.StatusFragment
import com.example.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var fragments = arrayOf(ChatFragment(), StatusFragment(), CallsFragment())
    var title = arrayOf("Chats", "Status", "Calls")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = HomePagesAdapter(supportFragmentManager, fragments, title)
        binding.tabs.setupWithViewPager(binding.viewPager)

        binding.dot.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this, binding.dot)
            popupMenu.menuInflater.inflate(R.menu.about, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.newGroup ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                    R.id.newBroadcast ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                    R.id.linkedDevice ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                    R.id.startedMessages ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                    R.id.payments ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                    R.id.settings ->
                        Toast.makeText(
                            this@MainActivity,
                            "You Clicked : " + item.title,
                            Toast.LENGTH_SHORT
                        ).show()
                }
                true
            })

            popupMenu.show()

        }


    }
}