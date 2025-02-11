package com.example.grab4.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.grab4.ui.akun.ChatFragment
import com.example.grab4.ui.akun.NotificationFragment

class ViewPagerAdapter2(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = ChatFragment()
            1 -> fragment = NotificationFragment()
        }
        return fragment as Fragment
    }
}