package com.example.tabs.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tabs.fragments.AboutFragment
import com.example.tabs.fragments.HomeFragment
import com.example.tabs.fragments.ProfileFragment

class PagerAdapter(fm:FragmentManager):FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
       when(position){
           0 -> return HomeFragment()
           1 -> return ProfileFragment()
           else -> return AboutFragment()
       }
    }

    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
       when(position){
           0 -> return "Home"
           1 -> return "Perfil"
           2 -> return "About"
           else -> return ""
       }
    }

}
