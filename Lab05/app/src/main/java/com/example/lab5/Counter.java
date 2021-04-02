package com.example.lab5;


public class Counter {
    private int maximum;
    private int minimum;
    private int step;
    private int start;


    public Counter(int maximum, int minimum, int start, int step) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.start = start;
        this.step = step;

    }

    public Counter() {
        this(100,-100,1,7);

    }
    public Counter(int start) {
        this.start = start;
    }

    public void addCount() {

        if (this.start <= this.maximum - this.step )
            this.start += this.step;

    }


    public void decreaseCount() {

        if (this.start >= this.minimum + this.step)
            this.start -= this.step;
    }
    public String getBinCount() {
        return Integer.toBinaryString(this.start);
    }
    public String getHexCount() {
        return Integer.toHexString(this.start);
    }

    public int getCount() {
        return this.start;
    }

    public void resetCount() {
        this.start = 0;
    }


}



