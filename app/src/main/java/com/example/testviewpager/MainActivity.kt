package com.example.testviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentList = arrayListOf<Fragment>(SampleFragment1(), SampleFragment2(), SampleFragment3())

        val adapter = SamplePagerAdapter(supportFragmentManager, fragmentList)
        viewpager.adapter = adapter
    }
}