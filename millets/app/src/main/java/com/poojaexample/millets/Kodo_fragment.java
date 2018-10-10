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

public class Kodo_fragment extends Fragment {
    WebView web;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("KODO MILLET");
        View view =inflater.inflate(R.layout.fragment_kodo,container,false);

        web =new WebView(getActivity());
        web=(WebView)view.findViewById(R.id.web_kodo);
        web.loadUrl("file:///android_asset/kodo.html");

        return view;
    }
}
