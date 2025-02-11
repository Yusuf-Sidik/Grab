package com.example.grab4.ui.kontak

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grab4.R
import com.example.grab4.databinding.FragmentKontakBinding
import com.example.grab4.ui.adapter.ViewPagerAdapter2
import com.google.android.material.tabs.TabLayoutMediator

class KontakFragment : Fragment() {

    companion object {
        private val TAB_AKUN = intArrayOf(
            R.string.tab_text_3,
            R.string.tab_text_4
        )
    }

    private var _binding: FragmentKontakBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentKontakBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewPager.adapter = ViewPagerAdapter2(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = resources.getString(TAB_AKUN[position])
        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}