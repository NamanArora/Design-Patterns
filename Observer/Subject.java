package com.company;

import java.util.ArrayList;

public class Subject {


    private int state=0;
    private ArrayList<Observer> observers = new ArrayList<>();

    public void attach(Observer o)
    {
        observers.add(o);
    }

    public void setState(int x)
    {
        this.state = x;
        notifyEvery();
    }

    private void notifyEvery()
    {
        for(Observer o: observers)
        {
            o.update(state);
        }
    }

}
