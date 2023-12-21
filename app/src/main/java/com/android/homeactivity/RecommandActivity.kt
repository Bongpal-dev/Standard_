package com.android.homeactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.homeactivity.databinding.ActivityMainBinding
import com.android.homeactivity.databinding.ActivityRecommandBinding

class RecommandActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecommandBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecommandBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        bottomNaviInit()
    }

    fun bottomNaviInit() {
        val tag = "bottom_navi_test"

        binding.bottomNavigationBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.webtoon -> {
                    Log.i(tag, "웹툰")
                    finish()
                    return@setOnItemSelectedListener true
                }
                R.id.recommand_end -> {
                    Log.i(tag, "추천완결")
                    return@setOnItemSelectedListener true
                }
                R.id.best -> {
                    Log.i(tag, "베스트 도전")
                    return@setOnItemSelectedListener true
                }
                R.id.my_menu -> {
                    Log.i(tag, "마이메뉴")
                    return@setOnItemSelectedListener true
                }
                R.id.mores -> {
                    Log.i(tag, "더보기")
                    return@setOnItemSelectedListener true
                }
                else -> {
                    Log.i(tag, "아")
                    false
                }
            }
        }
    }
}