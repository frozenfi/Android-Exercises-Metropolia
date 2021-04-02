package com.example.assighment2;

public class MainCounter {
    private int maximum;
    private int minimum;
    private int step;
    private int start;


    public MainCounter(int maximum, int minimum, int start, int step) {
        this.maximum = maximum;
        this.minimum = minimum;
        this.start = start;
        this.step = step;

    }

    public MainCounter() {
        this(100,-100,1,7);
    }

    public void addCount() {

        if (this.start <= this.maximum - this.step )
            this.start += this.step;
        }

    public void decreaseCount() {

        if (this.start >= this.minimum + this.step)
            this.start -= this.step;
    }
    public String getCount() {
        return Integer.toString(this.start);
    }

    public void resetCount() {
        this.start = 0;
    }


}
