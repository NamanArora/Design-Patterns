package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Chain add = new Add();
        Chain subtract = new Subtract();
        Chain divide = new Divide();

        add.nextChain(subtract);
        subtract.nextChain(divide);

        add.calculate(2,2,4);

    }
}
