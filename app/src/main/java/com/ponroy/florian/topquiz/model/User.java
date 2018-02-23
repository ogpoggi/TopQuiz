package com.ponroy.florian.topquiz.model;

/**
 * Created by Florian PONROY - OpenClassrooms on 09/08/17.
 */

public class User {
    private String mFirstname;
    private int mScore;


    public String getFirstname() {
        return mFirstname;
    }

    public void setFirstname(String firstname) {
        mFirstname = firstname;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int mScore) {
        this.mScore = mScore;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstname + '\'' +
                '}';
    }
}
