package com.example.jetpackappl

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_c, container, false)

        val buttonGoBack = view.findViewById<Button>(R.id.buttonGoBack)

        buttonGoBack.setOnClickListener {
            // Action to perform when 'Go Back to Home' button is clicked
            // For example, navigate back to the home fragment (assuming it's the start destination)
            findNavController().popBackStack(R.id.AFragment, false)
        }

        return view
    }
}
