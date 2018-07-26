package com.example.macwojs.guardiannews;

public class NewsData {

    private String mTitle;

    private String mTime;

    private String mUrl;

    private String mSection;

    private String mAutor;

    public NewsData(String title, String time, String url, String section, String autor){
        mTitle = title;
        mTime = time;
        mUrl = url;
        mSection = section;
        mAutor = autor;
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

    public String getmAutor() {
        return mAutor;
    }
}
