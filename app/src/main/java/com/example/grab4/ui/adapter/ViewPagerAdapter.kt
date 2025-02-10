package com.example.grab4.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.grab4.ui.viewpager.Aktivitas2Fragment
import com.example.grab4.ui.viewpager.DasborFragment

class ViewPagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> DasborFragment()
            1 -> Aktivitas2Fragment()
            else -> DasborFragment()
        }
    }
}