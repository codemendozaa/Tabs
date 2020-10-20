package com.example.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tabs.adapter.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tabs.setupWithViewPager(viewPager)
        viewPager.adapter = PagerAdapter(supportFragmentManager)
    }
}