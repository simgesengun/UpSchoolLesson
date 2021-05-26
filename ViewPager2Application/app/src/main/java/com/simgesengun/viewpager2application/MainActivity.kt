package com.simgesengun.viewpager2application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)

        val pagerAdapter = PagerAdapter(this)
        viewPager.adapter = pagerAdapter

        val newPageChangeCallback = object : ViewPager2.OnPageChangeCallback(){
            override fun onPageScrollStateChanged(state: Int) {
                super.onPageScrollStateChanged(state)
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                Log.e("onpagescrolled",position.toString())
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Log.e("onpageselected",position.toString())
            }
        }
        viewPager.registerOnPageChangeCallback(newPageChangeCallback)
    }
}