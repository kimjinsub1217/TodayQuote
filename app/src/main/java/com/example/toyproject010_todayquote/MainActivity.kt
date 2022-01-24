package com.example.toyproject010_todayquote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private val viewPager: ViewPager2 by lazy {
        findViewById(R.id.viewPager)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        viewPager.adapter = QuotesPagerAdaper(
            listOf(
                Quote(
                    "가장 하기 힘든 일은 아무 일도 안하는 것이다.",
                    "유대인 격언"
                )
            )
        )
    }
}