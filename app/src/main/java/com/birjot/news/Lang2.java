package com.birjot.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Lang2 extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ListView listView2;
    ArrayAdapter<String> adapter2;


    void initList() {

        listView2 = (ListView) findViewById(R.id.listview5);

        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter2.add("ENGLISH"); //0
        adapter2.add("PUNJABI");
        adapter2.add("FRENCH");

        listView2.setAdapter(adapter2);
        listView2.setOnItemClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lang2);
        initList();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position1, long id) {


        switch (position1) {
            case 0:
                Intent intent = new Intent(Lang2.this, customlist4.class);
                startActivity(intent);
                break;

            case 1:
                Intent intent1 = new Intent(Lang2.this, customlist5.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(Lang2.this, customlist6.class);
                startActivity(intent2);
                break;


        /*switch (pos){
            case 0:
                Intent intent = new Intent(MyListActivity.this,NewsActivity.class);
                startActivity(intent);
                break;

            case 1:

                break;
    }*/
        }
    }
}