package com.example.customlistview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String fruitList[] = { "Apple", "Banana", "Apricot", "Orange", "Water Melon" };
    int fruitImages[] = { R.drawable.apple, R.drawable.banana, R.drawable.apricot, R.drawable.orange, R.drawable.water_melon };

    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapetr = new CustomBaseAdapter(
                this,
                fruitList,
                fruitImages
        );
        listView.setAdapter(customBaseAdapetr);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("CUSTOM_LIST_VIEW", "item is clicked @ position ::" + position);
            }
        });
    }
}
