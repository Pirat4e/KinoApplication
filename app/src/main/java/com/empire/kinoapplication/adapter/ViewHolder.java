package com.empire.kinoapplication.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.empire.kinoapplication.R;

public class ViewHolder {
    public TextView text;
    public ImageView image;
    public ViewHolder (View convertView){
        text = (TextView) convertView.findViewById(R.id.txt_tittle);
        image = (ImageView) convertView.findViewById(R.id.img_poster);
    }
}
