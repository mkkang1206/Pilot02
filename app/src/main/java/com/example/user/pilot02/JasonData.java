package com.example.user.pilot02;

/**
 * Created by 20150092 on 2015-12-24.
 */
public class JasonData {
    private int data = 0;
    private String SUBJECT = "";
    private String REG_DT = "";
    private String VIEW_COUNT = "";
    private String THUMB_URL = "";

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getSUBJECT() {
        return SUBJECT;
    }

    public void setSUBJECT(String SUBJECT) {
        this.SUBJECT = SUBJECT;
    }

    public String getREG_DT() {
        return REG_DT;
    }

    public void setREG_DT(String REG_DT) {
        this.REG_DT = REG_DT;
    }

    public String getVIEW_COUNT() {
        return VIEW_COUNT;
    }

    public void setVIEW_COUNT(String VIEW_COUNT) {
        this.VIEW_COUNT = VIEW_COUNT;
    }

    public String getTHUMB_URL() {
        return THUMB_URL;
    }

    public void setTHUMB_URL(String THUMB_URL) {
        this.THUMB_URL = THUMB_URL;
    }

    @Override
    public String toString() {
        return "JasonData{" +
                "SUBJECT=" + SUBJECT +
                ", REG_DT='" + REG_DT + '\'' +
                ", VIEW_COUNT='" + VIEW_COUNT + '\'' +
                ", THUMB_URL='" + THUMB_URL + '\'' +
                '}';
    }
}