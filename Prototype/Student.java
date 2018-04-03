package com.company;

public class Student implements Cloneable {

    String name;
    int age;
    Course c;

    public Student(String name, int age, Course c)
    {
        this.name = name;
        this.age = age;
        this.c=c;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s = (Student)super.clone();
        s.c = (Course)c.clone();
        return (Object)s;

    }
}
