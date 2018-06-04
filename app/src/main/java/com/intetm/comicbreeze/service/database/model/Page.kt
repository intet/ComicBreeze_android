package com.intetm.comicbreeze.service.database.model


import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Page {

    @PrimaryKey
    var id: Long? = null

    @ColumnInfo(name = "comic")
    var comic: Int? = null

    @ColumnInfo(name = "index")
    var index: Int = 0

    @ColumnInfo(name = "url")
    var url: String? = null

}
