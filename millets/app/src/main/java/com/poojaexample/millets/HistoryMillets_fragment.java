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
public class HistoryMillets_fragment extends Fragment {
    WebView web1,web2,web3;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("HISTORY OF MILLETS");
        View view =inflater.inflate(R.layout.fragment_history,container,false);

        web1 =new WebView(getActivity());
        web1=(WebView)view.findViewById(R.id.web1_history);
        web1.loadUrl("file:///android_asset/history1.html");

        
        web3 =new WebView(getActivity());
        web3=(WebView)view.findViewById(R.id.web3_history);
        web3.loadUrl("file:///android_asset/history2.html");

        return view;
    }
}

