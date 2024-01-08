package com.example.jetpackappl
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        val buttonB = view.findViewById<Button>(R.id.buttonB)
        val buttonC = view.findViewById<Button>(R.id.buttonC)

        buttonB.setOnClickListener {
            findNavController().navigate(R.id.action_AFragment_to_BFragment)
        }

        buttonC.setOnClickListener {
            findNavController().navigate(R.id.action_AFragment_to_CFragment)
        }

        return view
    }
}
