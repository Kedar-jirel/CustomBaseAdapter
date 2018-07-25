package com.example.kedar.customadaptersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.kedar.customadaptersample.customAdapter.CustomAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MyAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.activity_main_listview);
        customAdapter = new MyAdapter(prepareArrayList(), getApplicationContext());
        listView.setAdapter(customAdapter);
    }

    private ArrayList<String> prepareArrayList() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("name");
        strings.add("name");
        strings.add("name");
        strings.add("name");
        strings.add("name");
        return strings;
    }
}
