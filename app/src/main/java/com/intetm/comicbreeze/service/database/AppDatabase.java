package com.intetm.comicbreeze.service.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.intetm.comicbreeze.service.database.dao.ComicDao;
import com.intetm.comicbreeze.service.database.model.Comic;
import com.intetm.comicbreeze.service.database.model.Page;

@Database(entities = {Comic.class, Page.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {
    public abstract ComicDao comicDao();
}