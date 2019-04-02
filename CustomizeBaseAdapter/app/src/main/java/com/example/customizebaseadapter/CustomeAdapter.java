package com.example.customizebaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomeAdapter extends BaseAdapter {
    int[] flag;
    String[] CountryName;
    Context context; //rececive activity
    LayoutInflater inflater; //Conver xml to view


    CustomeAdapter(Context context, String[] CountyName, int[] flag) {
        this.context = context;
        this.CountryName = CountyName;
        this.flag = flag;

    }

    @Override
    public int getCount() { //Total number of item return krobe
        return CountryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.simple_view, parent, false);


            ImageView imageView = null;
            try {
                imageView = (ImageView) convertView.findViewById(R.id.iconimage);

                TextView textView = (TextView) convertView.findViewById(R.id.txt1);

                imageView.setImageResource(flag[position]);
                textView.setText(CountryName[position]);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        return convertView;
    }
}
