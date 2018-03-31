package com.company;

public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog found");
    }


    @Override
    void say() {
        super.say();
        System.out.println("bhow");
    }

    void yolo(){


    }
}
