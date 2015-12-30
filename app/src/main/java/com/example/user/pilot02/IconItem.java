package com.example.user.pilot02;

/**
 * Created by 20150092 on 2015-12-24.
 */
public class IconItem {
    private String mIcon;
    private String[] mData;
    private boolean mSelectable = true;

    public IconItem(String icon, String[] obj) {
        mIcon = icon;
        mData = obj;
    }

    public IconItem(String icon, String obj01, String obj02, String obj03) {
        mIcon = icon;

        mData = new String[3];
        mData[0] = obj01;
        mData[1] = obj02;
        mData[2] = obj03;
    }

    public boolean isSelectable() {
        return mSelectable;
    }

    public void setSelectable(boolean selectable) {
        mSelectable = selectable;
    }

    public String[] getData() {
        return mData;
    }

    public String getData(int index) {
        if (mData == null || index >= mData.length) {
            return null;
        }

        return mData[index];
    }

    public void setData(String[] obj) {
        mData = obj;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getIcon() {
        return mIcon;
    }
}
