package com.shoppers.www.hackerramp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rahul on 4/25/2015.
 */
public class LendingItemAdapter extends ArrayAdapter {
    private Context context;
    private boolean useList = true;
    public LendingItemAdapter(Context context,List items){
        super(context,android.R.layout.simple_list_item_1,items);
        this.context=context;
    }
//    private class ViewHolder{
//        TextView titleText;
//    }

//    public View getView(int position,View convertView,ViewGroup parent){
//        ViewHolder holder = null;
//        LendingItem item =(LendingItem) getItem(position);
//        View viewToUse = null;
//        LayoutInflater mInflater = (LayoutInflater) context
//                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
//        if(convertView==null) {
//            if (useList) {
//                viewToUse = mInflater.inflate(R.layout.fragment_lendingitem_list, null);
//            } else {
//                viewToUse = mInflater.inflate(R.layout.fragment_lendingitem_grid, null);
//            }
//            holder = new ViewHolder();
//            holder.titleText = (TextView) viewToUse.findViewById(R.id.lending_item_title);
//            viewToUse.setTag(holder);
//
//        }else{
//            viewToUse = convertView;
//            holder = (ViewHolder)viewToUse.getTag();
//        }
//        holder.titleText.setText(item.getProductName());
//        return viewToUse;
//    }

}
