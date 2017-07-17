package com.birjot.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.birjot.news.R.drawable.ajit;
import static com.birjot.news.R.drawable.bs;
import static com.birjot.news.R.drawable.cs;
import static com.birjot.news.R.drawable.dc;
import static com.birjot.news.R.drawable.pp;

public class customlist5 extends AppCompatActivity implements AdapterView.OnItemClickListener{



    ListView listView;
    ArrayList<countryobject> pprlist;
    coAdapter adapter;

    void initlist() {
        listView = (ListView) findViewById(R.id.custom_list5);


        countryobject co4 = new countryobject(ajit, "AJIT");
        countryobject co5 = new countryobject(pp, "PUNJABI POST");
        //countryobject co6 = new countryobject(bs, "BRANDON SUN");

        pprlist = new ArrayList<countryobject>();
        pprlist.add(co4);
        pprlist.add(co5);
        //pprlist.add(co6);

        adapter = new coAdapter(this, R.layout.list_item, pprlist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist5);
        initlist();
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        countryobject countryName = adapter.getItem(position);



        Intent intent = new Intent(customlist5.this,web.class);

        switch (position){

            case 0:

                String at = "https://ajitweekly.com/";
                intent.putExtra("AT",at);
                startActivity(intent);
                break;

            case 1:

                String au = "http://punjabipost.ca/";
                intent.putExtra("AU",au);
                startActivity(intent);
                break;

            /*case 2:

                String dj = " http://www.brandonsun.com/breaking-news/";
                intent.putExtra("DJ",dj);
                startActivity(intent);
                break;*/

        }}
}




