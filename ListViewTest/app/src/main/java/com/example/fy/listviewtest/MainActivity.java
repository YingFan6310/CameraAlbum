package com.example.fy.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;




public class MainActivity extends AppCompatActivity {
    private String[] data={"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry",
            "Cherry","Mango","Apple","Banana","Orange","Watermelon","Pear"
            ,"Grape","Pineapple","Strawberry","Cherry","Mango"
    };
  //  private ArrayAdapter<String>adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }



}
