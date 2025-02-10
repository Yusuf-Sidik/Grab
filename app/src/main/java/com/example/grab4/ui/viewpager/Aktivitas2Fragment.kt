package com.example.grab4.ui.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grab4.R
import com.example.grab4.databinding.FragmentAktivitas2Binding

class Aktivitas2Fragment : Fragment() {

    private var _binding: FragmentAktivitas2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAktivitas2Binding.inflate(inflater, container, false)
        return binding.root

    }

}