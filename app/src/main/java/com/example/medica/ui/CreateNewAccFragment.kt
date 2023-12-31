package com.example.medica.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.medica.R
import com.example.medica.databinding.FragmentCreateNewAccBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class CreateNewAccFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCreateNewAccBinding.inflate(inflater)

        binding.imageView10.setOnClickListener {
            findNavController().navigate(R.id.action_createNewAccFragment_to_youInFragment)
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_createNewAccFragment_to_logInFragment)
        }

        binding.textView11.setOnClickListener {
            findNavController().navigate(R.id.action_createNewAccFragment_to_logInFragment)
        }


        return binding.root
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CreateNewAccFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}