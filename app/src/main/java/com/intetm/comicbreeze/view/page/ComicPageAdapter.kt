package com.intetm.comicbreeze.view.page

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ComicPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 10
    }

    override fun getItem(position: Int): Fragment? {
        return ComicPageFragment.newInstance(position)
    }
}