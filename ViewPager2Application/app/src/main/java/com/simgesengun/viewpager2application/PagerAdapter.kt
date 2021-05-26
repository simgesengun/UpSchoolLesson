package com.simgesengun.viewpager2application

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fa : FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 10

    override fun createFragment(position: Int): Fragment = SlidePageFragment()
}