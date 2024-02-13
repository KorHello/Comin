package com.devhouse.comin.Fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when(position) { //else를 꼭 사용해야함 switch문하고 똑같음
            0 ->{
            FirstFragment()
            }
            1 ->{
            Secondragment()
            }
            else ->{
            ThirdFragment()
            }
        }
    }


}