package com.empire.kinoapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.empire.kinoapplication.NewActivity;
import com.empire.kinoapplication.R;
import com.empire.kinoapplication.model.Post;
import com.squareup.picasso.Picasso;

import java.util.List;


public class KinoAdapter extends ArrayAdapter<Post> {
   

public KinoAdapter(Context context, int resource) {
    super(context, resource);
    
}


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Post p = getItem(position);
        viewHolder.text.setText(p.getTitle());
        Picasso.with(this.context)
                .load(String.valueOf(p.getAttachments()))
                .placeholder(R.drawable.temp_img)
                .tag(context)
                .resize(900, 350)
                .into(viewHolder.image);

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, NewActivity.class);
                intent.putExtra("title", p.getTitle());
                intent.putExtra("content", p.getContent());
                context.startActivity(intent);
            }
        });
        return convertView;
    }

}
