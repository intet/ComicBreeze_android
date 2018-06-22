package com.intetm.comicbreeze.view.grid

import android.support.v4.view.PagerAdapter
import android.view.View

class ComicPageAdapter : PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        return 10
    }
}