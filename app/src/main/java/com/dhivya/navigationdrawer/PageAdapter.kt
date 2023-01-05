package com.dhivya.navigationdrawer

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PageAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        when(position){
            0 ->{ return MessageFragment()}
            1 ->{ return SettingsFragment()}
            2 ->{ return SyncFragment()}
            else ->{ return MessageFragment()}
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 ->{ return "Message"}
            1 ->{ return "Settings"}
            2 ->{ return "Sync"}
        }
        return super.getPageTitle(position)
    }
    override fun getCount(): Int {
        return 3
    }
}