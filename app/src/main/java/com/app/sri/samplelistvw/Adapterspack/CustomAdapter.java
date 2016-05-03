package com.app.sri.samplelistvw.Adapterspack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.sri.samplelistvw.R;

/**
 * Created by Sridevi on 1/26/2016.
 */
public class CustomAdapter extends BaseAdapter {

    public Context mcontext;
    public String[] mplacesarray;
    public CustomAdapter(Context context,String[] placesarray){

         mcontext=context;
         mplacesarray=placesarray;
    }

    @Override
    public int getCount() {
        return mplacesarray.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowview=null;
        LayoutInflater layoutInflater=(LayoutInflater) mcontext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        rowview=layoutInflater.inflate(R.layout.activity_list,null);
        TextView tv;
        tv=(TextView)rowview.findViewById(R.id.textView);
        tv.setText(mplacesarray[position]);

        LinearLayout linearLayoutid=(LinearLayout)rowview.findViewById(R.id.linearlayoutid);
        if(position==0) {
            linearLayoutid.setBackgroundColor(mcontext.getResources().getColor(
                    android.R.color.holo_green_dark));
        }else if(position==1){
            linearLayoutid.setBackgroundColor(mcontext.getResources().getColor(
                    android.R.color.holo_blue_light));
        }else if(position==2){
            linearLayoutid.setBackgroundColor(mcontext.getResources().getColor(
                    android.R.color.holo_orange_dark));
        }
        return rowview;



    }
}
