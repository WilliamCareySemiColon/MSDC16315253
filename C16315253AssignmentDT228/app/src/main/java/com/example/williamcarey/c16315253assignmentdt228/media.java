package com.example.williamcarey.c16315253assignmentdt228;

import android.content.Context;

public class Media extends Product {

    private String link;


    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Media(String name, String brand, String keyword,
                 String type, String dateReleased, String desc,
                 String generalReview, float price,
                 BackEndDatabase context, String link)
    {
        super(name, brand, keyword, type, dateReleased, desc,
                generalReview, price, context);

        this.link = link;
    }
}
