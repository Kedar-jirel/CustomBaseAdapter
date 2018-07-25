package com.example.kedar.customadaptersample.customAdapter;

import android.database.DataSetObserver;
import android.widget.ListAdapter;

public abstract class CustomAdapter implements ListAdapter {


    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int getItemViewType(int position) {
     return  position;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public boolean hasStableIds() {
        return  true;
    }

    public boolean areAllItemsEnabled() {
        return true;
    }

    public boolean isEnabled(int var1) {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver observer) {
    }

    public void unregisterDataSetObserver(DataSetObserver observer) {
    }




}
