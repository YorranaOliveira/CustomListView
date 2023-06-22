package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String listFruit[];
    int listImages[];
    LayoutInflater inflater;

    public CustomBaseAdapter(Context ctx, String [] fruitList, int [] images){
        this.context = ctx;
        this.listFruit = fruitList;
        this.listImages = images;
        inflater = LayoutInflater.from(ctx);
    }


    @Override
    public int getCount() {
        return listFruit.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView txtView = (TextView) convertView.findViewById(R.id.textView);
        ImageView fruitImg = (ImageView) convertView.findViewById(R.id.imagemIcom);
        txtView.setText(listFruit[position]);
        fruitImg.setImageResource(listImages[position]);
        return convertView;
    }
}
