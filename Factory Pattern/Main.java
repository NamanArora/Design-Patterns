package com.company;

public class Main extends AnimalFactory{

    public static void main(String[] args) {
	// write your code here
        AnimalFactory f = new AnimalFactory();
        Animal a = f.getAnimal("dog");
        Animal b = f.getAnimal("cat");
        a.makeSound();
        b.makeSound();
        a.say();
        b.say();

    }
}
