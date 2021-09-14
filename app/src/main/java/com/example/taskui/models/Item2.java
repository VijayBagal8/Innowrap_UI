package com.example.taskui.models;

public class Item2 {
    private final String text1;
    private final int img,color;

    public Item2(String text1, int img, int color) {
        this.text1 = text1;
        this.img = img;
        this.color = color;
    }

    public String getText1() {
        return text1;
    }

    public int getImg() {
        return img;
    }
    public int getColor() {
        return color;
    }
}
