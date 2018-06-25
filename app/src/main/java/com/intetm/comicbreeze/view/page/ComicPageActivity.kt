package com.intetm.comicbreeze.view.page

import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.intetm.comicbreeze.R

class ComicPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)

        val pager = findViewById<ViewPager>(R.id.pager)
        pager.adapter = ComicPageAdapter(supportFragmentManager)
    }
}