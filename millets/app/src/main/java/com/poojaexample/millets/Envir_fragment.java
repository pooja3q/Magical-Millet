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
public class Envir_fragment extends Fragment {
    WebView web1,web2;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("MILLETS AND ENVIRONMENT");
        View view =inflater.inflate(R.layout.fragment_enviro,container,false);

        WebView web1 =new WebView(getActivity());
        web1=(WebView)view.findViewById(R.id.web_enviro);
        WebView web2 =new WebView(getActivity());
        web2=(WebView)view.findViewById(R.id.web2_enviro);
        web1.loadUrl("file:///android_asset/enviro.html");
        web2.loadUrl("file:///android_asset/envir02.html");
        return view;
    }
}

