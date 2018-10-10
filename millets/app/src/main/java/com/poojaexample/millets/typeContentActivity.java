package com.poojaexample.millets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class typeContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        Intent intent=getIntent();
        String basicField=intent.getStringExtra("basicFields");
        if (basicField.equals("Pearl Millet"))
        {
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction ft=manager.beginTransaction();
            ft.replace(R.id.fragment_container1,new Pearl_fragment());
            Toast.makeText(this,""+basicField,Toast.LENGTH_LONG).show();
            ft.commit();
        }
        else if (basicField.equals("Barnyard Millet"))
        {
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction ft=manager.beginTransaction();
            ft.replace(R.id.fragment_container1,new Barnyard_fragment());
            Toast.makeText(this,""+basicField,Toast.LENGTH_LONG).show();
            ft.commit();
        }
        else if (basicField.equals("Sorghum Millet"))
        {
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction ft=manager.beginTransaction();
            ft.replace(R.id.fragment_container1,new Sorghum_fragment());
            Toast.makeText(this,""+basicField,Toast.LENGTH_LONG).show();
            ft.commit();
        }
        else if (basicField.equals("Foxtail Millet"))
        {
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction ft=manager.beginTransaction();
            ft.replace(R.id.fragment_container1,new Foxtail_fragment());
            Toast.makeText(this,""+basicField,Toast.LENGTH_LONG).show();
            ft.commit();
        }
        else if (basicField.equals("Finger Millet"))
        {
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction ft=manager.beginTransaction();
            ft.replace(R.id.fragment_container1,new Finger_fragment());
            Toast.makeText(this,""+basicField,Toast.LENGTH_LONG).show();
            ft.commit();
        }
        else if (basicField.equals("Kodo Millet"))
        {
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction ft=manager.beginTransaction();
            ft.replace(R.id.fragment_container1,new Kodo_fragment());
            Toast.makeText(this,""+basicField,Toast.LENGTH_LONG).show();
            ft.commit();
        }
        else if (basicField.equals("Little Millet"))
        {
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction ft=manager.beginTransaction();
            ft.replace(R.id.fragment_container1,new Little_fragment());
            Toast.makeText(this,""+basicField,Toast.LENGTH_LONG).show();
            ft.commit();
        }
        else if (basicField.equals("Proso Millet"))
        {
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction ft=manager.beginTransaction();
            ft.replace(R.id.fragment_container1,new Proso_fragment());
            Toast.makeText(this,""+basicField,Toast.LENGTH_LONG).show();
            ft.commit();
        }

    }

}
