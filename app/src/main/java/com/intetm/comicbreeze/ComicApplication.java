package com.intetm.comicbreeze;

import android.app.Application;

import com.intetm.comicbreeze.service.database.DatabaseService;

public class ComicApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DatabaseService.init(getApplicationContext());
    }
}
