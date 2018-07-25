package com.example.kedar.customadaptersample;

import android.content.ContentValues;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.kedar.customadaptersample.customAdapter.CustomAdapter;

import java.util.ArrayList;

public class MyAdapter extends CustomAdapter  {
    ArrayList<String> stringArrayList = new ArrayList<>();
    Context context;

    public MyAdapter(ArrayList<String> stringArrayList, Context context) {
        this.stringArrayList = stringArrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return stringArrayList.size();
    }

    @Override
    public Object getItem(int var1) {
        return stringArrayList.get(var1);
    }

    @Override
    public long getItemId(int var1) {
        return var1;
    }

    @Override
    public View getView(int var1, View convertView, ViewGroup var3) {
        // inflate the layout for each list row
        if (convertView == null) {
            convertView = LayoutInflater.from(var3.getContext()).
                    inflate(R.layout.layout_list_view_row_items, var3, false);
        }

        // get current item to be displayed
        String currentItem = (String) getItem(var1);

        // get the TextView for item name and item description
        TextView textViewItemName = (TextView)
                convertView.findViewById(R.id.text_view_item_name);


        //sets the text for item name and item description from the current item object
        textViewItemName.setText(currentItem);

        // returns the view for the current row
        return convertView;
    }
}
