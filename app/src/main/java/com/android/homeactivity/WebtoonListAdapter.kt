package com.android.homeactivity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class WebtoonListAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val num_page = 10

    override fun getItemCount(): Int = num_page

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> Monday.newInstance("page1", "")
            1 -> Monday.newInstance("page2", "")
            2 -> Monday.newInstance("page3", "")
            3 -> Monday.newInstance("page4", "")
            4 -> Monday.newInstance("page5", "")
            5 -> Monday.newInstance("page6", "")
            6 -> Monday.newInstance("page7", "")
            7 -> Monday.newInstance("page8", "")
            8 -> Monday.newInstance("page9", "")
            9 -> Monday.newInstance("page10", "")
            else -> Monday.newInstance("page8", "")
        }
    }
}