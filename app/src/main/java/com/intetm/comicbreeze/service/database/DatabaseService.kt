package com.intetm.comicbreeze.service.database

import android.arch.persistence.room.Room
import android.content.Context

class DatabaseService private constructor(applicationContext: Context) {

    val db: AppDatabase = Room.databaseBuilder<AppDatabase>(applicationContext, AppDatabase::class.java, "db").build()

    companion object {

        var instance: DatabaseService? = null
            private set

        fun init(applicationContext: Context) {
            instance = DatabaseService(applicationContext)
        }
    }
}
