package com.example.ankit.recylertut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
  RecyclerView recyclerView;
    private  ArrayList<Data>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recylerView);
        list = new ArrayList<Data>();
        getList();
       recyclerView.setAdapter(new RecyleAdapter(this, list));
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
    public void  getList() {
        String test[] = {"Ankit","Vivek","Udit","suman","Raju"};
        int icon[] = {android.R.drawable.ic_popup_reminder, android.R.drawable.ic_btn_speak_now,android.R.drawable.ic_delete,
                android.R.drawable.ic_dialog_email,android.R.drawable.ic_input_add};
        for(int i=0; i<icon.length; i++) {
            Data info = new Data();
          info.setTitle(test[i]);
            info.setImage(icon[i]);
            list.add(info);
        }

    }
}
