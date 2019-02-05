package com.example.wetherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.wetherapp.R.layout.activity_list;
import static com.example.wetherapp.R.layout.activity_main;

public class ListActivity extends AppCompatActivity {
    String items[]= new String[]{"Android","Iphone","Windows","Linux","Blackberry"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_list);
        ListView listView=  (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListActivity.this, EmptyActivity.class);
                startActivity(intent);
            }
        });
        //listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            //@Override
          //  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              //  Intent intent = new Intent(ListActivity.this, EmptyActivity.class);
                //startActivity(intent);
           // }
       // });
    }
}
