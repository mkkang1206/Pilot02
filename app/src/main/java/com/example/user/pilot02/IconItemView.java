package com.example.user.pilot02;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class IconItemView extends LinearLayout{

    private ImageView mIcon;

    private TextView mText01;
    private TextView mText02;
    private TextView mText03;

    public IconItemView(Context context, IconItem aItem) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.list_item, this, true);

        mIcon = (ImageView) findViewById(R.id.imageIcon);
        Resources res = getResources();
        BitmapDrawable mNoImage = (BitmapDrawable) res.getDrawable(R.drawable.image_not_found);

        //Glide.with(getContext()).load(aItem.getIcon()).into(mIcon);

        if(aItem.getIcon().length()==0){

            mIcon.setImageDrawable(mNoImage);
        }else {
            Glide.with(getContext()).load(aItem.getIcon()).into(mIcon);
        }

        Log.d("ImageTest",aItem.getIcon());



        // Set Text 01
        mText01 = (TextView) findViewById(R.id.subject);
        mText01.setText(aItem.getData(0));

        // Set Text 02
        mText02 = (TextView) findViewById(R.id.regDate);
        mText02.setText(aItem.getData(1));

        // Set Text 03
        mText03 = (TextView) findViewById(R.id.viewCount);
        mText03.setText(aItem.getData(2));
    }

    public void setText(int index, String data) {
        if (index == 0) {
            mText01.setText(data);
        } else if (index == 1) {
            mText02.setText(data);
        } else if (index == 2) {
            mText03.setText(data);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setIcon(String icon) {

        Glide.with(getContext()).load(icon).into(mIcon);
    }
}
