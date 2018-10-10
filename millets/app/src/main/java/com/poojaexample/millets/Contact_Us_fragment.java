package com.poojaexample.millets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Shikhar Sinha on 2/9/2017.
 */

public class Contact_Us_fragment extends Fragment {
    TextView tv1,tv2,tv3;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_about,container,false);
        tv1=(TextView)view.findViewById(R.id.text_abt2);
        tv2=(TextView)view.findViewById(R.id.text_abt4);
        tv3=(TextView)view.findViewById(R.id.text_abt6);
        tv1.setText("JAYA TRIPATHI\njayatripathi1009@gmail.com\n");
        tv2.setText("Prof. (Dr.) Ranu Prasad\nranu.prasad@shiats.edu.in\nsdean_eshs@shiats.edu.in\n");
        tv3.setText("Shikhar Sinha\nsinhashikhar9@gmail.com\nPooja Yadav\npooja3q@gmail.com");
        return view;
    }

}
