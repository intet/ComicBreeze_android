package com.intetm.comicbreeze.service.database.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
class Comic {

    @PrimaryKey
    var id: Long? = null

    @ColumnInfo(name = "name")
    var name: String? = null

    @ColumnInfo(name = "about")
    var about: String? = null

    @ColumnInfo(name = "url")
    var url: String? = null

    @ColumnInfo(name = "img_url")
    var imgUrl: String? = null

    @ColumnInfo(name = "page_count")
    var pageCount: Int = 0
}
