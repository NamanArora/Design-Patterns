package com.company;

public class Divide implements Chain {

    private Chain next;

    @Override
    public void calculate(int i, int j, int exp) {
        if(i/j==exp)
            System.out.println(i+"/"+j+"="+exp);
        else
            System.out.println("Cant find result");
    }

    @Override
    public void nextChain(Chain c) {
        next=null;
    }
}
