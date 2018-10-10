package com.poojaexample.millets;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by Shikhar Sinha on 2/7/2017.
 */

public class Sorghum_fragment extends Fragment
{
    WebView web;
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        getActivity().setTitle("SORGHUM MILLET");
        view=inflater.inflate(R.layout.fragment_sorghum,container,false);
        ////tv=(TextView)view.findViewById(R.id.text_view);
        web=new WebView(getActivity());
        web=(WebView)view.findViewById(R.id.web_sorghum);
        web.loadUrl("file:///android_asset/sorghum.html");
        return view;
    }
}