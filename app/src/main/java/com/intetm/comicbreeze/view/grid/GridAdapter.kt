package com.intetm.comicbreeze.view.grid

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.intetm.comicbreeze.R
import com.intetm.comicbreeze.service.database.DatabaseService
import com.intetm.comicbreeze.service.database.model.Comic
import kotlinx.coroutines.experimental.async


private val mThumbIds = arrayOf<Int>(
        R.drawable.sample_2, R.drawable.sample_3,
        R.drawable.sample_4, R.drawable.sample_5,
        R.drawable.sample_6, R.drawable.sample_7,
        R.drawable.sample_0, R.drawable.sample_1,
        R.drawable.sample_2, R.drawable.sample_3,
        R.drawable.sample_4, R.drawable.sample_5,
        R.drawable.sample_6, R.drawable.sample_7,
        R.drawable.sample_0, R.drawable.sample_1,
        R.drawable.sample_2, R.drawable.sample_3,
        R.drawable.sample_4, R.drawable.sample_5,
        R.drawable.sample_6, R.drawable.sample_7)


class GridAdapter(private val mContext: Context) : BaseAdapter() {
    private val comics = mutableListOf<Comic>()

    override fun getCount(): Int {
        return this.comics.size
    }

    override fun getItem(position: Int): Any? = null

    override fun getItemId(position: Int): Long = 0L

    // create a new ImageView for each item referenced by the Adapter
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val comicView: View
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            comicView = inflater.inflate(R.layout.comic_grid_item, null)
            comicView.layoutParams = ViewGroup.LayoutParams(500, 200)
            comicView.setPadding(8, 8, 8, 8)
        } else {
            comicView = convertView
        }
        val textView = comicView.findViewById<TextView>(R.id.grid_item_label)
        textView.text = this.comics[position].name
        return comicView
    }

    fun refresh() = async {
        comics.clear()
        val comicDao = DatabaseService.instance!!.db.comicDao()
        comics.addAll(comicDao.all)
        notifyDataSetChanged()
    }
}