package com.example.grab4.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.grab4.R
import com.example.grab4.databinding.ActivityDetail1Binding

class Detail1Activity : AppCompatActivity() {

    private lateinit var binding: ActivityDetail1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetail1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        binding.arrowBack.setOnClickListener{
            finish()
        }
    }



}