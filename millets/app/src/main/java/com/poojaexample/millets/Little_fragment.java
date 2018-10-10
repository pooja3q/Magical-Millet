package com.poojaexample.millets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by Shikhar Sinha on 2/7/2017.
 */

public class Little_fragment extends Fragment {
    WebView web;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("LITTLE MILLET");
        View view =inflater.inflate(R.layout.fragment_little,container,false);

        web =new WebView(getActivity());
        web=(WebView)view.findViewById(R.id.web_little);
        web.loadUrl("file:///android_asset/little.html");

        return view;
    }
}
