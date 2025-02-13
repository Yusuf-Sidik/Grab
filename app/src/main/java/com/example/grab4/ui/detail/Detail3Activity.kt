package com.example.grab4.ui.detail

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.grab4.R
import com.example.grab4.databinding.ActivityDetail3Binding

class Detail3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityDetail3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetail3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        val photo = intent.getIntExtra("photo", 0)
        binding.imgPoster.setImageResource(photo)

        binding.imageView7.setOnClickListener {
            finish()
        }

    }
}