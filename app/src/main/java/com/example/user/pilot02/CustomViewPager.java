package com.example.user.pilot02;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;


/**
 * Created by user on 2015-12-24.
 */
public class CustomViewPager extends ViewPager {

    public boolean melted;

    public CustomViewPager(Context context) {
        super(context);
        freeze();
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        freeze();
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        try {
                if (melted) {
                    return super.onTouchEvent(event);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (melted) {
            return super.onInterceptTouchEvent(event);
        }
        return false;
        }

     public void freeze() {
        melted = false;
        }

        public void melt() {
            melted = true;
        }
}
