package com.intetm.comicbreeze

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.intetm.comicbreeze.service.database.DatabaseService
import com.intetm.comicbreeze.service.database.model.Comic
import com.intetm.comicbreeze.service.network.NetService
import kotlinx.coroutines.experimental.async

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(v: View) = async {
        val c = Comic()
        c.name = "test name"

        val comicDao = DatabaseService.instance!!.db.comicDao()
        val service = NetService.create()
        service.loadComic()
        findViewById<(TextView)>(R.id.main_text).setText("3"+comicDao.all.size)
    }
}
