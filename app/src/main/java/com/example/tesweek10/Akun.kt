package com.example.tesweek10

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Akun : Fragment() {
    private lateinit var tvWelcome: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_akun, container, false)

        // Initialize the TextView
        tvWelcome = rootView.findViewById(R.id.tvWelcome)

        val username = arguments?.getString("USERNAME")

        // Use the received username
        tvWelcome.text = "Selamat Datang, $username!"

        return rootView
    }
}

