package com.example.whatsapp

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.example.whatsapp.Fragments.CallsFragment
import com.example.whatsapp.Fragments.ChatFragment
import com.example.whatsapp.Fragments.StatusFragment
import com.example.whatsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var fragments = arrayOf(ChatFragment(),StatusFragment(),CallsFragment())
    var title = arrayOf("Chats","Status","Calls")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = HomePagesAdapter(supportFragmentManager,fragments,title)
        binding.tabs.setupWithViewPager(binding.viewPager)

    }

}