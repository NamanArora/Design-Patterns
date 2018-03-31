package com.company;

public class Eager {
    //make sure this is private
    private static Eager instance = new Eager();

    public static Eager getInstance()
    {
        return instance;
    }
    //and this too
    private Eager(){}
}
