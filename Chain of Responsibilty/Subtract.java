package com.company;

public class Subtract implements Chain{

    private Chain next;

    @Override
    public void calculate(int i, int j, int exp) {
        if(i-j==exp)
            System.out.println(i+"-"+j+"="+exp);
        else
            next.calculate(i,j,exp);
    }

    @Override
    public void nextChain(Chain c) {
        next=c;
    }

}
