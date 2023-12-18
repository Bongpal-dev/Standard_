package com.android.homeactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vp_webtoonList = findViewById<ViewPager2>(R.id.vp_webtoon_list)
        val tl_webtoon_menu = findViewById<TabLayout>(R.id.tl_webtoon_tab_menu)
        val vp_top_banner = findViewById<ViewPager2>(R.id.vp_top_banner)

        vp_webtoonList.apply {
            adapter = WebtoonListAdapter(context as FragmentActivity)
        }

        vp_top_banner.apply {
            adapter = TopBannerAdapter(context as FragmentActivity)
        }

        TabLayoutMediator(tl_webtoon_menu, vp_webtoonList) { tab, position ->
            tab.text = when (position) {
                0 -> "신작"
                1 -> "월"
                2 -> "화"
                3 -> "수"
                4 -> "목"
                5 -> "금"
                6 -> "토"
                7 -> "일"
                else -> "금"
            }
        }.attach()

    }


}
