package com.intetm.comicbreeze.view.page

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.intetm.comicbreeze.R


class ComicPageFragment : Fragment() {
    private var pageNumber: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageNumber = if (arguments != null) arguments!!.getInt("num") else 1
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val result = inflater.inflate(R.layout.comic_page_fragment, container, false)
        /*val pageHeader = result.findViewById(R.id.displayText) as TextView
        val header = String.format("Фрагмент %d", pageNumber + 1)
        pageHeader.text = header*/
        val imageView = result.findViewById<ImageView>(R.id.iv_photo)

        Glide.with(this)
                .load("http://i.imgur.com/ovr0NAF.jpg")
                .into(imageView)
        return result
    }

    companion object {
        fun newInstance(page: Int): ComicPageFragment {
            val fragment = ComicPageFragment()
            val args = Bundle()
            args.putInt("num", page)
            fragment.arguments = args
            return fragment
        }
    }
}