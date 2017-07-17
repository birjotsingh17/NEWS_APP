package com.birjot.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Lang3 extends AppCompatActivity implements AdapterView.OnItemClickListener{



    ListView listView1;
    ArrayAdapter<String> adapter1;


    void initList() {

        listView1 = (ListView) findViewById(R.id.listviewlang2);

        adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter1.add("ENGLISH"); //0
        adapter1.add("SPANISH");
        adapter1.add("FRENCH");

        listView1.setAdapter(adapter1);
        listView1.setOnItemClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang3);
        initList();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 0:
                Intent intent = new Intent(Lang3.this, customlist7.class);
                startActivity(intent);
                break;

            case 1:
                Intent intent1 = new Intent(Lang3.this, customlist8.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(Lang3.this, customlist9.class);
                startActivity(intent2);
                break;
    }
}}
