package com.example.taskui.models;

public class Item {
    private final int type;
    private final Object obj;

    public Item(int type, Object obj) {
        this.type = type;
        this.obj = obj;
    }

    public int getType() {
        return type;
    }

    public Object getObj() {
        return obj;
    }
}
