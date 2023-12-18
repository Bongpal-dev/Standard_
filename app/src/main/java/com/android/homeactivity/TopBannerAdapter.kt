package com.android.homeactivity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class TopBannerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    private val num_page = 4

    override fun getItemCount(): Int  = num_page

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                TopBanner.newInstance("page1", "")
            }

            1 -> {
                TopBanner.newInstance("page2", "")
            }

            2 -> {
                TopBanner.newInstance("page3", "")
            }

            3 -> {
                TopBanner.newInstance("page4", "")
            }

            4 -> {
                TopBanner.newInstance("page5", "")
            }

            else -> {
                TopBanner.newInstance("page8", "")
            }
        }
    }
}

