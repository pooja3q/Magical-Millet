package com.poojaexample.millets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Pooja on 05-02-2017.
 */
public class Main_fragment extends Fragment {
    WebView web;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       getActivity().setTitle("MAGICAL MILLETS");
        View view =inflater.inflate(R.layout.fragment_main,container,false);

        return view;
    }
}

