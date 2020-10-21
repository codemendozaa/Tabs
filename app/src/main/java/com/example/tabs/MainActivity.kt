package com.example.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tabs.adapter.PagerAdapter
import com.example.tabs.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tabs.setupWithViewPager(viewPager)
        binding.viewPager.adapter = PagerAdapter(supportFragmentManager)
    }
}