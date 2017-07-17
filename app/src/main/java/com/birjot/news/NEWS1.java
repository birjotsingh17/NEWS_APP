package com.birjot.news;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NEWS1 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    ArrayList<countryobject> countrylist;
    coAdapter adapter;

    void initlist() {
        listView = (ListView) findViewById(R.id.listview);

        countryobject co1 = new countryobject(R.drawable.india, "INDIA");
        countryobject co2 = new countryobject(R.drawable.ca, "CANADA");
        countryobject co3 = new countryobject(R.drawable.usa, "USA");

        countrylist = new ArrayList<countryobject>();
        countrylist.add(co1);
        countrylist.add(co2);
        countrylist.add(co3);

        adapter = new coAdapter(this, R.layout.list_item, countrylist);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news1);
        initlist();

    }

    public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
        countryobject countryName = adapter.getItem(pos);
       // Toast.makeText(this, "You Clicked: " + countryName, Toast.LENGTH_LONG).show();


        switch (pos){
            case 0:
                Intent intent = new Intent(NEWS1.this,Lang1.class);
                startActivity(intent);
                break;

           case 1:
                Intent intent1 = new Intent(NEWS1.this,Lang2.class);
                startActivity(intent1);
                break;

            case 2:
                Intent intent2 = new Intent(NEWS1.this,Lang3.class);
                startActivity(intent2);
                break;

        }

    }
}
