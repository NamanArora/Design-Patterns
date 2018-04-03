package com.company;

public class ObserverB implements Observer {
    @Override
    public void update(int x) {
        System.out.println(x);
    }
}
