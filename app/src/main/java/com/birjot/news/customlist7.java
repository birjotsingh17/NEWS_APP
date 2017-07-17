package com.birjot.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

//import static com.birjot.news.R.drawable.USA;
import static com.birjot.news.R.drawable.bs;
import static com.birjot.news.R.drawable.cs;
import static com.birjot.news.R.drawable.dc;
import static com.birjot.news.R.drawable.gu;
import static com.birjot.news.R.drawable.usaaa;

public class customlist7 extends AppCompatActivity implements AdapterView.OnItemClickListener{



    ListView listView;
    ArrayList<countryobject> pprlist;
    coAdapter adapter;

    void initlist() {
        listView = (ListView) findViewById(R.id.custom_list7);


        countryobject co4 = new countryobject(usaaa, "USA TODAY");
        countryobject co5 = new countryobject(gu, "theguardian");
        //countryobject co6 = new countryobject(bs, "BRANDON SUN");

        pprlist = new ArrayList<countryobject>();
        pprlist.add(co4);
        pprlist.add(co5);
       // pprlist.add(co6);

        adapter = new coAdapter(this, R.layout.list_item, pprlist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist7);
        initlist();
    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        countryobject countryName = adapter.getItem(position);



        Intent intent = new Intent(customlist7.this,web.class);

        switch (position){

            case 0:

                String at = "https://www.usatoday.com/";
                intent.putExtra("AT",at);
                startActivity(intent);
                break;

            case 1:

                String au = "https://www.theguardian.com/us-news";
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
