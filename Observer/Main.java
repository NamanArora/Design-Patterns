package com.company;

public class Main{

    public static void main(String[] args) {
        // write your code here

        Subject a = new Subject();



        a.attach(new ObserverA());
        a.attach(new ObserverB());

        a.setState(10);
        a.setState(11);


    }

}
