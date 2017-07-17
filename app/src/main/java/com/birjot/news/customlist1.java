package com.birjot.news;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.birjot.news.R.drawable.ht;
import static com.birjot.news.R.drawable.toi;

public class customlist1 extends AppCompatActivity implements AdapterView.OnItemClickListener{


    ListView listView;
    ArrayList<countryobject> pprlist;
    coAdapter adapter;


    void initlist() {
        listView = (ListView) findViewById(R.id.listppr1);


        countryobject co4 = new countryobject(toi, "TIMES OF INDIA");
        countryobject co5 = new countryobject(R.drawable.tribune, "THE TRIBUNE");
        countryobject co6 = new countryobject(ht, "HINDUSTAN TIMES");

        pprlist = new ArrayList<countryobject>();
        pprlist.add(co4);
        pprlist.add(co5);
        pprlist.add(co6);

        adapter = new coAdapter(this, R.layout.list_item, pprlist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist1);
        initlist();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        countryobject countryName = adapter.getItem(position);



        Intent intent = new Intent(customlist1.this,web.class);

        switch (position){

            case 0:

            String at = "http://timesofindia.indiatimes.com/";
            intent.putExtra("AT",at);
            startActivity(intent);
            break;

            case 1:

            String au = "http://www.tribuneindia.com/";
            intent.putExtra("AU",au);
            startActivity(intent);
            break;

            case 2:
            
            String dj = " http://www.hindustantimes.com/ ";
            intent.putExtra("DJ",dj);
            startActivity(intent);
            break;

        }}
        }

/*
        switch (position){
            case 0:
                Intent intent = new Intent(customlist1.this,web.class);
                startActivity(intent);
                break;

            case 1:
                Intent intent1 = new Intent(customlist1.this,Lang2.class);
                startActivity(intent1);
                break;

            case 2:
                Intent intent2 = new Intent(customlist1.this,Lang3.class);
                startActivity(intent2);
                break;}*/




