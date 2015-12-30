package com.example.user.pilot02;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailView extends LinearLayout {

    Context mContext;
    Resources res = getResources();


    private TextView subject;
    private ImageView icon;

    private String title;


    private String image;

    public DetailView(Context context) {
        super(context);
        init(context);
    }

    public DetailView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(final Context context) {
        mContext = context;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.detail_view, this, true);

        subject = (TextView) findViewById(R.id.deSubject);
        icon = (ImageView) findViewById(R.id.deIcon);
    }

    public TextView getSubject() {
        return subject;
    }

    public void setSubject(TextView subject) {
        this.subject = subject;
    }

    public ImageView getIcon() {
        return icon;
    }

    public void setIcon(ImageView icon) {
        this.icon = icon;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        subject.setText(title);
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    //---------김민규---------//
    public void setImage(String image) {
        if(image.length()==0){

            BitmapDrawable mNoImage = (BitmapDrawable) res.getDrawable(R.drawable.image_not_found);
            icon.setImageDrawable(mNoImage);
        }else {
            Glide.with(getContext()).load(image).into(icon);
        }
        this.image = image;
    }
}
