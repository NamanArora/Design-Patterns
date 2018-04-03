package com.company;

public class Course implements Cloneable {
    String c1,c2;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Course(String a, String b)
    {
        c1=a;
        c2=b;
    }
}
