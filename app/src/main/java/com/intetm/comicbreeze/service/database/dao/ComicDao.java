package com.intetm.comicbreeze.service.database.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.intetm.comicbreeze.service.database.model.Comic;

import java.util.List;

@Dao
public interface ComicDao {
    @Query("SELECT * FROM comic")
    List<Comic> getAll();

    @Insert
    void insertAll(Comic... comics);

    @Delete
    void delete(Comic comic);
}
