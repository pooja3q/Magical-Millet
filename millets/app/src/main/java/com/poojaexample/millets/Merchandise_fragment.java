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

public class Merchandise_fragment extends Fragment {
    WebView web;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       getActivity().setTitle("MILLETS IN THE MERCHANDISE");
        View view =inflater.inflate(R.layout.fragment_merchandise,container,false);

        web =new WebView(getActivity());
        web=(WebView)view.findViewById(R.id.web_merchandise);
        web.loadUrl("file:///android_asset/merchandise.html");

        return view;
    }
}
