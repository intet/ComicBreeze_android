package com.intetm.comicbreeze.service.database.model;

import java.util.List;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity
public class Comic {

    @PrimaryKey
    public Long id;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "about")
    public String about;

    @ColumnInfo(name = "url")
    public String url;

    @ColumnInfo(name = "img_url")
    public String imgUrl;

    @ColumnInfo(name = "page_count")
    public int pageCount;
}
