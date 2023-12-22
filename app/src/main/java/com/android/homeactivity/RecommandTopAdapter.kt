package com.android.homeactivity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class RecommandTopAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val num_page = 10
    override fun getItemCount(): Int = num_page
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RecommandTop.newInstance("page1", "")
            1 -> RecommandTop.newInstance("page2", "")
            2 -> RecommandTop.newInstance("page3", "")
            3 -> RecommandTop.newInstance("page4", "")
            4 -> RecommandTop.newInstance("page5", "")
            5 -> RecommandTop.newInstance("page6", "")
            6 -> RecommandTop.newInstance("page7", "")
            7 -> RecommandTop.newInstance("page8", "")
            8 -> RecommandTop.newInstance("page9", "")
            9 -> RecommandTop.newInstance("page10", "")
            else -> RecommandTop.newInstance("page8", "")
        }
    }
}