package com.collisionarts.charruacon.charruacon;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by Diego on 31/1/2018.
 */

public class AdapterTalk extends BaseAdapter {
    protected Activity activity;
    protected ArrayList<Talk> items;

    public AdapterTalk (Activity activity, ArrayList<Talk> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public void addAll(ArrayList<Talk> talk) {
        for (int i = 0; i < talk.size(); i++) {
            items.add(talk.get(i));
        }
    }

    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.talk_category, null);
        }

        Talk dir = items.get(position);

        TextView title = (TextView) v.findViewById(R.id.title);
        title.setText(dir.getTitle());

        TextView description = (TextView) v.findViewById(R.id.description);
        description.setText(dir.getDescription());

        TextView time = (TextView) v.findViewById(R.id.time);
        time.setText("Hora: " +dir.getTime());

        TextView location = (TextView) v.findViewById(R.id.location);
        location.setText("Lugar: " + dir.getLocation());

        ImageView iV = (ImageView) v.findViewById(R.id.image);
        iV.setBackground(dir.getImage());

        TextView name = (TextView) v.findViewById(R.id.name);
        name.setText("Nombre: " + dir.getName() );

        ImageView IvCountry = (ImageView) v.findViewById(R.id.country);
        if(dir.getCountry() == "UY")
        {

            IvCountry.setImageResource(R.drawable.if_uruguay_flag_32365);
        }
        if(dir.getCountry() == "AR")
        {

            IvCountry.setImageResource(R.drawable.if_argentina_flag_32164);
        }
        if(dir.getCountry() == "ES")
        {

            IvCountry.setImageResource(R.drawable.if_spain_flag_32338);
        }

        return v;
    }
}
