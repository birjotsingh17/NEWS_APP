package com.birjot.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static com.birjot.news.R.drawable.at;
import static com.birjot.news.R.drawable.au;
import static com.birjot.news.R.drawable.dj;
//import static com.birjot.news.R.drawable.ht;
//import static com.birjot.news.R.drawable.toi;

public class customlist3 extends AppCompatActivity implements AdapterView.OnItemClickListener{



    ListView listView;
    ArrayList<countryobject> pprlist;
    coAdapter adapter;

    void initlist() {
        listView = (ListView) findViewById(R.id.custom_list3);


        countryobject co4 = new countryobject(at, "AAJ TAK");
        countryobject co5 = new countryobject(au, "AMAR UJALA");
        countryobject co6 = new countryobject(dj, "DAINIK JAGRAN");

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
        setContentView(R.layout.activity_customlist3);
        initlist();
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        countryobject countryName = adapter.getItem(position);



        Intent intent = new Intent(customlist3.this,web.class);

        switch (position){

            case 0:

                String at = "http://aajtak.intoday.in/";
                intent.putExtra("AT",at);
                startActivity(intent);
                break;

            case 1:

                String au = "http://www.amarujala.com/";
                intent.putExtra("AU",au);
                startActivity(intent);
                break;

            case 2:

                String dj = " http://www.jagran.com/";
                intent.putExtra("DJ",dj);
                startActivity(intent);
                break;

        }}
}

