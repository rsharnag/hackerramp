package com.shoppers.www.hackerramp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

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
    private class ViewHolder{
        TextView titleText;
        ImageView itemImage;
        TextView lendPrice;
    }


    public View getView(int position,View convertView,ViewGroup parent) {
        ViewHolder holder = null;
        LendingItem item = (LendingItem) getItem(position);
        View viewToUse = null;
        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View rowView = mInflater.inflate(R.layout.item_label, parent, false);
        holder = new ViewHolder();
        holder.titleText = (TextView) rowView.findViewById(R.id.firstLine);
        holder.itemImage = (ImageView) rowView.findViewById(R.id.icon);
        holder.lendPrice = (TextView) rowView.findViewById(R.id.secondLine);

        holder.titleText.setText(item.getProductName());
        holder.lendPrice.setText(item.getLendPrice());
//        holder.itemImage.setImageResource(R.drawable.);
        return rowView;
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
}
