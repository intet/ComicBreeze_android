package com.intetm.comicbreeze

import android.app.Application
import com.intetm.comicbreeze.service.comic.ComicListService

import com.intetm.comicbreeze.service.database.DatabaseService

class ComicApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        DatabaseService.init(applicationContext)
        ComicListService.init()
    }
}
