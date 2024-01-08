package com.example.jetpackappl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class BFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        // Find the Button C in the inflated layout
        val buttonC = view.findViewById<Button>(R.id.buttonC)

        buttonC.setOnClickListener {
            findNavController().navigate(R.id.action_BFragment_to_CFragment)
        }

        return view
    }
}
