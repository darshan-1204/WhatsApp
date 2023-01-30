package com.example.whatsapp.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapp.CallsAdapter
import com.example.whatsapp.R.drawable.*
import com.example.whatsapp.databinding.FragmentCallsBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class CallsFragment : Fragment() {

    lateinit var binding: FragmentCallsBinding


    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    var person = arrayOf(
        "Vaibhav",
        "Paras",
        "Jalo",
        "Darshan",
        "Rahi",
        "Akhtar",
        "Bhavesh",
        "Romit",
        "Ravi",
        "Vaibhav",
        "Paras",
        "Jalo",
        "Darshan",
        "Rahi",
        "Akhtar",
        "Bhavesh",
        "Romit",
        "Ravi"
    )
    var time = arrayOf(
        "15 minutes ago",
        "27 minutes ago",
        "43 minutes ago",
        "54 minutes ago",
        "Today, 8:40 AM",
        "Today, 8:03 AM",
        "Today, 7:17 AM ",
        "Today, 12:14 AM",
        "Yesterday, 11:22 PM",
        "Yesterday, 10:08 PM",
        "Yesterday, 9:09 PM",
        "Yesterday, 9:06 PM",
        "Yesterday, 8:50 PM",
        "Yesterday, 7:34 PM",
        "Yesterday, 1:16 PM",
        "Yesterday, 12:52 PM",
        "Yesterday, 12:24 PM",
        "Yesterday, 10:51 AM"
    )
    var img = intArrayOf(
        user1,
        user2,
        user3,
        user4,
        user5,
        user6,
        user1,
        user2,
        user3,
        user1,
        user2,
        user3,
        user4,
        user5,
        user6,
        user1,
        user2,
        user3
    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentCallsBinding.inflate(inflater, container, false)


        var adapter = CallsAdapter(context, person, time, img)
        binding.recyclerCalls.adapter = adapter

        var layoutManager: LinearLayoutManager = LinearLayoutManager(context)
        binding.recyclerCalls.layoutManager = layoutManager

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CallsFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CallsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}