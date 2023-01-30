package com.example.whatsapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.R.drawable.*
import com.example.whatsapp.RecycleAdapter
import com.example.whatsapp.StatusAdapter
import com.example.whatsapp.databinding.FragmentChatBinding
import com.example.whatsapp.databinding.FragmentStatusBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class StatusFragment : Fragment() {

    lateinit var binding :FragmentStatusBinding

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    var person = arrayOf("Vaibhav","Paras","Jalo","Darshan","Rahi","Akhtar","Bhavesh","Romit","Ravi","Vaibhav","Paras","Jalo","Darshan","Rahi","Akhtar","Bhavesh","Romit","Ravi")
    var time = arrayOf("15 minutes ago", "27 minutes ago", "43 minutes ago", "54 minutes ago", "Today, 8:40 AM", "Today, 8:03 AM", "Today, 7:17 AM ", "Today, 12:14 AM", "Yesterday, 11:22 PM","Yesterday, 10:08 PM", "Yesterday, 9:09 PM", "Yesterday, 9:06 PM", "Yesterday, 8:50 PM", "Yesterday, 7:34 PM", "Yesterday, 1:16 PM", "Yesterday, 12:52 PM", "Yesterday, 12:24 PM", "Yesterday, 10:51 AM")
    var img = intArrayOf(user1, user2, user3, user4, user5, user6, user1, user2, user3,user1, user2, user3, user4, user5, user6, user1, user2, user3)



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

        binding =  FragmentStatusBinding.inflate(inflater, container, false)

        var adapter = StatusAdapter(context,person,time,img)
        binding.recyclerStatus.adapter = adapter

        var layoutManager : LinearLayoutManager = LinearLayoutManager(context)
        binding.recyclerStatus.layoutManager = layoutManager

        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            StatusFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}