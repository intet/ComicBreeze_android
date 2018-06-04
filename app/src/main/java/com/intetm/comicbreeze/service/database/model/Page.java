package com.intetm.comicbreeze.service.database.model;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Page {

    @PrimaryKey
    public Long id;

    @ColumnInfo(name = "comic")
    public Integer comic;

    @ColumnInfo(name = "index")
    public int index;

    @ColumnInfo(name = "url")
    public String url;

}
