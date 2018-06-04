package com.intetm.comicbreeze.service.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query

import com.intetm.comicbreeze.service.database.model.Comic

@Dao
interface ComicDao {
    @get:Query("SELECT * FROM comic")
    val all: List<Comic>

    @Insert
    fun insertAll(vararg comics: Comic)

    @Delete
    fun delete(comic: Comic)
}
