package com.birjot.news;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by birjot on 12/7/17.
 */

public class coAdapter extends ArrayAdapter<countryobject> {

    Context context;
    int resource;
    ArrayList<countryobject> coList;

    public coAdapter(Context context, int resource, ArrayList<countryobject> objects) {
        super(context, resource, objects);


        this.context = context;
        this.resource= resource;
        coList = objects;
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = null;

        view = LayoutInflater.from(context).inflate(resource,parent,false);
        ImageView imageView = (ImageView)view.findViewById(R.id.imageView2);
        TextView txtName = (TextView)view.findViewById(R.id.textViewName);

        countryobject co = coList.get(position);
        imageView.setBackgroundResource(co.getIcon());
        txtName.setText(co.getName());

        return view;
    }
}
