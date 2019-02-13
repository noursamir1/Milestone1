package com.example.wetherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import static com.example.wetherapp.R.id.imageView2;
import static com.example.wetherapp.R.layout.activity_list;
import static com.example.wetherapp.R.layout.activity_main;

public class ListActivity extends AppCompatActivity {
    int[]images={R.drawable.sql,R.drawable.java,R.drawable.javascript,R.drawable.c,R.drawable.python,R.drawable.cplus,R.drawable.php};
    String items[]= new String[]{"SQL","Java","Java Script","C","Python","C++","PHP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(activity_list);

        ListView listView = (ListView) findViewById(R.id.list);

        customadapter customAdapter=new customadapter();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,items);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListActivity.this, EmptyActivity.class);
                startActivity(intent);
            }
        });
    }
        class customadapter extends BaseAdapter{

            @Override
            public int getCount() {
                return images.length;
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
            public View getView(int position, View view, ViewGroup parent) {
                view=getLayoutInflater().inflate(R.layout.customlayout,null);

                ImageView imageView=(ImageView)view.findViewById(R.id.imageView2);

                TextView textView_name=(TextView)view.findViewById(R.id.textView_name);

                imageView.setImageResource(images[position]);

                textView_name.setText(items[position]);




                return view;
            }
        }

}
