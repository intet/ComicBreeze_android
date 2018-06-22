package com.intetm.comicbreeze.service.database.dao

import android.arch.persistence.room.*

import com.intetm.comicbreeze.service.database.model.Comic

@Dao
interface ComicDao {
    @get:Query("SELECT * FROM comic")
    val all: List<Comic>

    @Query("select count(1) from comic ")
    fun count(): Int

    @Insert
    fun insertAll(vararg comics: Comic)

    @Delete
    fun delete(comic: Comic)

    @Query("SELECT * FROM comic where name = :name")
    fun findByName(name: String): Comic?

    @Update()
    fun update(comic: Comic)
}
