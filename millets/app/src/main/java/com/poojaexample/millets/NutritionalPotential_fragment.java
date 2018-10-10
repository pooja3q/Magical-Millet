package com.poojaexample.millets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Shikhar Sinha on 2/6/2017.
 */

public class NutritionalPotential_fragment extends Fragment {
    WebView web;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("NUTRITIONAL PROTENTIAL OF MILLETS");
        View view =inflater.inflate(R.layout.fragment_nutritionalpoten,container,false);

        web =new WebView(getActivity());
        web=(WebView)view.findViewById(R.id.web_nutritionalpoten);
        web.loadUrl("file:///android_asset/nutril_poten.html");

        return view;
    }
}
