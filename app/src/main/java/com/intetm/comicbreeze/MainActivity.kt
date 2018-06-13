package com.intetm.comicbreeze

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import com.intetm.comicbreeze.service.comic.ComicListService
import com.intetm.comicbreeze.service.database.DatabaseService
import com.intetm.comicbreeze.service.database.model.Comic
import com.intetm.comicbreeze.view.grid.GridAdapter
import kotlinx.coroutines.experimental.async

class MainActivity : AppCompatActivity() {

    fun btnClick(v: View) = async {
        val c = Comic()
        c.name = "test name"

        val comicDao = DatabaseService.instance!!.db.comicDao()
        ComicListService.instance!!.loadComic()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridview: GridView = findViewById(R.id.gridview)
        gridview.adapter = GridAdapter(this)

        gridview.onItemClickListener =
                AdapterView.OnItemClickListener { parent, v, position, id ->
                    Toast.makeText(this, "$position", Toast.LENGTH_SHORT).show()
                }
    }
}
