package com.intreve.listviewcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] data={"Apple", "Banana", "Strawberry", "Pineapple", "Grape","Peach"};

        int images[]={R.drawable.apple, R.drawable.banana, R.drawable.strawberry, R.drawable.pineapple, R.drawable.grape, R.drawable.peach};

        ListView listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter(this, data, images);
        listView.setAdapter(adapter);
    }
}