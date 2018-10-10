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
public class Cultivating_fragment extends Fragment {
    WebView web,web1;
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
              getActivity().setTitle("CULTIVATING MILLETS");
        View view =inflater.inflate(R.layout.fragment_culti,container,false);

        web =new WebView(getActivity());
        web=(WebView)view.findViewById(R.id.web_culti);
        web1 =new WebView(getActivity());
        web1=(WebView)view.findViewById(R.id.web1_culti);
        web.loadUrl("file:///android_asset/culti.html");
        web1.loadUrl("file:///android_asset/culti1.html");

        return view;
    }
}
