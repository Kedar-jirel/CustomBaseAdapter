package com.example.kedar.customadaptersample.customAdapter;

import android.database.DataSetObserver;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewGroup;

public interface CustomAdapterInterface {
    int IGNORE_ITEM_VIEW_TYPE = -1;
    int NO_SELECTION = -2147483647;

    void registerDataSetObserver(DataSetObserver var1);

    void unregisterDataSetObserver(DataSetObserver var1);

    int getCount();

    Object getItem(int var1);

    long getItemId(int var1);

    void notifyDataSetInvalidated();

    void notifyDataSetChanged();

    View getView(int var1, View var2, ViewGroup var3);



    @RequiresApi(api = Build.VERSION_CODES.N)
    default CharSequence[] getAutofillOptions() {
        throw new RuntimeException("Stub!");
    }
}
