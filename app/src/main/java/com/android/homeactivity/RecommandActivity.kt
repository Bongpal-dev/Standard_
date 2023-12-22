package com.android.homeactivity

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.FragmentActivity
import com.android.homeactivity.databinding.ActivityMainBinding
import com.android.homeactivity.databinding.ActivityRecommandBinding
import com.android.homeactivity.databinding.FragmentRecommandTopBinding
import com.google.android.material.tabs.TabLayoutMediator
import java.nio.channels.InterruptedByTimeoutException

class RecommandActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecommandBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecommandBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        bottomNaviInit()
        topMenuAdapterConnect()
        searchButtonInit()
    }

    private fun topMenuAdapterConnect() {
        binding.vpTopMenu.apply {
            adapter = RecommandTopAdapter(context as FragmentActivity)
        }
    }

    private fun bottomNaviInit() {
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

    private fun searchButtonInit() {
        val pickImageLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val imageUri: Uri? = result.data?.data

                findViewById<ImageView>(R.id.recommand_top)?.apply {
                    setImageURI(imageUri)
                }
            }
        }

        binding.btnSearch.setOnClickListener {
            Log.i("button click", "버튼이 눌렸어요")
            val intent = Intent(Intent.ACTION_PICK)

            intent.type = "image/*"
            pickImageLauncher.launch(intent)
        }
    }
}