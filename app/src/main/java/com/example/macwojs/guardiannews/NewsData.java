package com.example.macwojs.guardiannews;

public class NewsData {

    private String mTitle;

    private String mTime;

    private String mUrl;

    private String mSection;

    public NewsData(String title, String time, String url, String section){
        mTitle = title;
        mTime = time;
        mUrl = url;
        mSection = section;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmTime() {
        return mTime;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmSection() {
        return mSection;
    }
}
