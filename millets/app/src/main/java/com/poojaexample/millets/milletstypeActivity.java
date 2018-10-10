package com.poojaexample.millets;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class milletstypeActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listview;
    listAdapter adapter;
    ArrayList<String> basicFields;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milletstype);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        basicFields = new ArrayList<>();
        listview=(ListView)findViewById(R.id.listview_typemillets);
        basicFields.add("Pearl Millet");
        basicFields.add("Barnyard Millet");
        basicFields.add("Sorghum Millet");
        basicFields.add("Foxtail Millet");
        basicFields.add("Finger Millet");
        basicFields.add("Kodo Millet");
        basicFields.add("Little Millet");
        basicFields.add("Proso Millet");
        Typeface typeface=Typeface.createFromAsset(getAssets(), "font/OLDENGL.ttf");
        adapter = new listAdapter(getLayoutInflater(),basicFields,typeface);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {

            String data= basicFields.get(position);
            Intent intent=new Intent(this,typeContentActivity.class);
            intent.putExtra("basicFields",data);
            startActivity(intent);


    }
}
