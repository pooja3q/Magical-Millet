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
public class Introduction_fragment extends Fragment {
    WebView web1,web2;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("INTRODUCTION");
        View view =inflater.inflate(R.layout.fragment_intro,container,false);

        web1 =new WebView(getActivity());
        web2 =new WebView(getActivity());
        web1=(WebView)view.findViewById(R.id.web_intro);
        web2=(WebView)view.findViewById(R.id.web_intro1);
        web1.loadUrl("file:///android_asset/intro.html");
        web2.loadUrl("file:///android_asset/intro1.html");



        return view;
    }
}
