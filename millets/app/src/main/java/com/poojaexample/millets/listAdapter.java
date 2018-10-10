package com.poojaexample.millets;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Pooja on 05-02-2017.
 */
public class listAdapter extends BaseAdapter
{   Typeface typeface;
    ArrayList names;
    LayoutInflater inflater;

    public listAdapter(LayoutInflater inflater, ArrayList names,Typeface typeface)
    {   this.typeface=typeface;
        this.inflater = inflater;
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return names.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        if (view == null)
        {
            view= inflater.inflate(R.layout.list_layout,null);

        }
        TextView textView = (TextView) view.findViewById(R.id.listview_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.listview_image);
        textView.setTypeface(typeface);

        if (names.get(position).toString().equals("Pearl Millet"))
        {
            imageView.setImageResource(R.mipmap.pearl_millet4);
            textView.setText("Pearl Millet");

        }
        else  if (names.get(position).toString().equals("Barnyard Millet"))
        {
            imageView.setImageResource(R.mipmap.barnyard_millet3);
            textView.setText("Barnyard Millet");
        }

        else  if (names.get(position).toString().equals("Sorghum Millet"))
        {
            imageView.setImageResource(R.mipmap.sorghum_millet3);
            textView.setText("Sorghum Millet");
        }

        else  if (names.get(position).toString().equals("Foxtail Millet"))
        {
            imageView.setImageResource(R.mipmap.foxtail_millets);
            textView.setText("Foxtail Millet");
        }

        else  if (names.get(position).toString().equals("Finger Millet"))
        {
            imageView.setImageResource(R.mipmap.finger_millet3);
            textView.setText("Finger Millet");
        }

        else  if (names.get(position).toString().equals("Kodo Millet"))
        {
            imageView.setImageResource(R.mipmap.kodo_millets3);
            textView.setText("Kodo Millet");
        }

        else  if (names.get(position).toString().equals("Little Millet"))
        {
            imageView.setImageResource(R.mipmap.little_millet3);
            textView.setText("Little Millet");
        }

        else  if (names.get(position).toString().equals("Proso Millet"))
        {
            imageView.setImageResource(R.mipmap.proso_millet);
            textView.setText("Proso Millet");
        }
        return view;
    }
}
