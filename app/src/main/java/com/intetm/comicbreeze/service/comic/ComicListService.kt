package com.intetm.comicbreeze.service.comic

import android.content.Context
import android.util.Log
import com.intetm.comicbreeze.service.database.DatabaseService
import com.intetm.comicbreeze.service.database.dao.ComicDao
import com.intetm.comicbreeze.service.database.model.Comic
import com.intetm.comicbreeze.service.network.NetApi
import com.intetm.comicbreeze.service.network.Util

class ComicListService private constructor(comicDao:ComicDao) {
    private val api:NetApi = NetApi.create()
    private val comicDao = comicDao

    fun loadComic(){
        api.getData().subscribe(::process, ::error)
    }

    private fun process(list:List<Comic> ){
       list.forEach({ comicInfo ->
           val comicName = comicInfo.name ?: return
           val comic = comicDao.findByName(comicName)?: Comic()
           if(comic.url==comicInfo.url && comic.pageCount == comicInfo.pageCount) return
           comic.url = comicInfo.url
           comic.name = comicInfo.name
           comic.about = comicInfo.about
           comic.imgUrl = comicInfo.imgUrl
           comic.pageCount = comicInfo.pageCount
           if(comic.id==null){
               comicDao.insertAll(comic)
           }
           else{
               comicDao.update(comic)
           }
       })
    }


    companion object {
        var instance: ComicListService? = null
            private set

        fun init() {
            instance = ComicListService(DatabaseService.instance!!.db.comicDao())
        }
    }
}