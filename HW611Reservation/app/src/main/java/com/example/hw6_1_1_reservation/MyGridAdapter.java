package com.example.hw6_1_1_reservation;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class MyGridAdapter extends BaseAdapter {
    Context context_PosterGrid;

    public MyGridAdapter(Context c){
        context_PosterGrid = c;
    }
    public int getCount(){
        return MainActivity.posterID.length;
    }
    public Object getItem(int position){
        return null;
    }
    public long getItemId(int position){
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context_PosterGrid);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(400, 650));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(5, 5, 10, 10);

        imageView.setImageResource((MainActivity.posterID[position]));


        return imageView;
    }
}
