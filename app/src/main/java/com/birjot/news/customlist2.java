package com.birjot.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.birjot.news.R.drawable.ht;
import static com.birjot.news.R.drawable.jag;
import static com.birjot.news.R.drawable.pk;
import static com.birjot.news.R.drawable.puntri;
import static com.birjot.news.R.drawable.toi;

public class customlist2 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    ArrayList<countryobject> pprlist;
    coAdapter adapter;


    void initlist() {
        listView = (ListView) findViewById(R.id.custom_list2);


        countryobject co7 = new countryobject(puntri, "PUNJABI TRIBUNE");
        countryobject co8 = new countryobject(pk, "PUNJAB KESRI");
        countryobject co9 = new countryobject(jag, "JAG BANI");

        pprlist = new ArrayList<countryobject>();
        pprlist.add(co7);
        pprlist.add(co8);
        pprlist.add(co9);

        adapter = new coAdapter(this, R.layout.list_item, pprlist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist2);
        initlist();
    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        countryobject countryName = adapter.getItem(position);



        Intent intent = new Intent(customlist2.this,web.class);

        switch (position){

            case 0:

                String at = "http://www.punjabtribune.com/";
                intent.putExtra("AT",at);
                startActivity(intent);
                break;

            case 1:

                String au = "http://www.punjabkesari.in/";
                intent.putExtra("AU",au);
                startActivity(intent);
                break;

            case 2:

                String dj = " http://jagbani.punjabkesari.in/ ";
                intent.putExtra("DJ",dj);
                startActivity(intent);
                break;

        }}
}


