package com.intetm.comicbreeze;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.intetm.comicbreeze.service.database.DatabaseService;
import com.intetm.comicbreeze.service.database.dao.ComicDao;
import com.intetm.comicbreeze.service.database.model.Comic;

import java.util.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View v){
        Comic c =  new Comic();
        c.name = "test name";
        ComicDao comicDao = DatabaseService.getInstance().db.comicDao();
      //  comicDao.insertAll(c);
      //  ((TextView)findViewById(R.id.main_text)).setText(comicDao.getAll().size());
    }
}
