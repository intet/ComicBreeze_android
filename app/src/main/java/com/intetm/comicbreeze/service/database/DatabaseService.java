package com.intetm.comicbreeze.service.database;

import android.arch.persistence.room.Room;
import android.content.Context;

public class DatabaseService {

    private static DatabaseService INSTANCE  = null;
    public static DatabaseService getInstance() {
      return INSTANCE;
    }
    public static void init(Context applicationContext) {
        INSTANCE = new DatabaseService(applicationContext);
    }

    public final AppDatabase db;

    private DatabaseService(Context applicationContext) {
         db = Room.databaseBuilder(applicationContext, AppDatabase.class, "db").build();
    }
}
