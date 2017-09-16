package com.example.aelaf.listtorecyclerview;

/**
 * Created by aelaf on 9/15/17.
 */

public class Movie {
    private String title;
    private String Detail;

    public Movie(String title, String detail) {
        this.title = title;
        Detail = detail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }
}
