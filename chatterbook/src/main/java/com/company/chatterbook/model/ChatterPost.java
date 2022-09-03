package com.company.chatterbook.model;

public class ChatterPost {

    //The ChatterPost model object should contain one string instance variable named text

    private String text;

    //create constructor
    public ChatterPost(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
