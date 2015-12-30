package com.example.user.pilot02;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

public class ItemListAdapter extends BaseAdapter {

    private Context mContext;

    private List<IconItem> mItems = new ArrayList<IconItem>();

    public ItemListAdapter(Context context) {
        mContext = context;
    }

    public void addItem(IconItem it) {
        mItems.add(it);
    }

    public void setListItems(List<IconItem> lit) {
        mItems = lit;
    }

    public int getCount() {
        return mItems.size();
    }

    public Object getItem(int position) {
        return mItems.get(position);
    }

    public boolean areAllItemsSelectable() {
        return false;
    }

    public boolean isSelectable(int position) {
        try {
            return mItems.get(position).isSelectable();
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        IconItemView itemView;
        if (convertView == null) {
            itemView = new IconItemView(mContext, mItems.get(position));
        } else {
            itemView = (IconItemView) convertView;

            itemView.setIcon(mItems.get(position).getIcon());
            itemView.setText(0, mItems.get(position).getData(0));
            itemView.setText(1, mItems.get(position).getData(1));
            itemView.setText(2, mItems.get(position).getData(2));
        }

        return itemView;
    }

    //---------김민규---------//
    public String getmTitle(int position){
        return mItems.get(position).getData(0);
    }

    public String getmImage(int position){
        return mItems.get(position).getIcon();
    }

}
