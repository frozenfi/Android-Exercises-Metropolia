package com.example.assighment2;

import android.content.Context;

public class Counter {
    int count = 0;

    public Counter() {
    }

    public void addCount() {
        this.count++;
    }

    public void decreaseCount() {
        this.count--;
    }

    public String getCount() {
        return Integer.toString(this.count);
    }

    public void resetCount() {
        this.count = 0;
    }



}
