package com.company;

public class ObserverA implements Observer {
    @Override
    public void update(int x) {
        System.out.println(x);
    }
}
