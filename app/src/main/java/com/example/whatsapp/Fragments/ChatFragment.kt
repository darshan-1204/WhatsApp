package com.example.whatsapp.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.whatsapp.R.drawable.*
import com.example.whatsapp.RecycleAdapter
import com.example.whatsapp.databinding.FragmentChatBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ChatFragment : Fragment() {
    // TODO: Rename and change types of parameters

    lateinit var binding :FragmentChatBinding

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    var text = arrayOf("Hi","Hello","Kem Chho","Namaste","How are you","Have a nice day","Hey!!","No","Are you free?","Hi","Hello","Kem Chho","Namaste","How are you","Have a nice day","Hey!!","No","Are you free?")
    var person = arrayOf("Vaibhav","Paras","Jalo","Darshan","Rahi","Akhtar","Bhavesh","Romit","Ravi","Vaibhav","Paras","Jalo","Darshan","Rahi","Akhtar","Bhavesh","Romit","Ravi")
    var time = arrayOf("12:45", "11:33", "7:50", "6:55", "4:28", "1:03", "Yesterday", "Yesterday", "Yesterday","12:45", "11:33", "7:50", "6:55", "4:28", "1:03", "Yesterday", "Yesterday", "Yesterday")
    var img = intArrayOf(user1, user2, user3, user4, user5, user6, user1, user2, user3,user1, user2, user3, user4, user5, user6, user1, user2, user3)



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {

       binding =  FragmentChatBinding.inflate(inflater, container, false)


        var adapter = RecycleAdapter(context,person,text,time,img)
        binding.recycler.adapter = adapter

        var layoutManager : LinearLayoutManager = LinearLayoutManager(context)
        binding.recycler.layoutManager = layoutManager

        return binding.root

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChatFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}