package com.example.medica.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.medica.R
import com.example.medica.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}