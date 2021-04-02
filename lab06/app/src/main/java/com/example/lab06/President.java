package com.example.lab06;

public class President {
    private String name;
    private int presidencyStart;
    private int presidencyEnd;
    private String speciality;

    public President(String name, int presidencyStart, int presidencyEnd, String speciality) {
        this.name = name;
        this.presidencyStart = presidencyStart;
        this.presidencyEnd = presidencyEnd;
        this.speciality = speciality;
    }

    public String getName() {
        return this.name;
    }


    public String getPresidencyStart() {
        return Integer.toString(this.presidencyStart);
    }

    public String getPresidencyEnd() {
        return Integer.toString(this.presidencyEnd);
    }

    public String getSpeciality() {
        return this.speciality;
    }

    @Override
    public String toString() {
        return this.name + " " + this.presidencyStart + " " + this.presidencyEnd + " " + this.speciality;
    }

}
