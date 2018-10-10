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
public class Whymillets_fragment extends Fragment {
    WebView web1,web2;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_whymillets,container,false);

        web1 =new WebView(getActivity());
        web2 =new WebView(getActivity());
        web1=(WebView)view.findViewById(R.id.web1_whymillets);
        web2=(WebView)view.findViewById(R.id.web2_whymillets);
        web2.loadUrl("file:///android_asset/whymillets2.html");
        web1.loadUrl("file:///android_asset/whymillets1.html");

        return view;
    }
}
