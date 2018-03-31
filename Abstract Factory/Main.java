package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FamilyFactory ff = new FamilyFactory();
        SpeciesFactory sf = ff.getFactory("mammal");
        Animal animal = sf.getAnimal("cat");
        animal.makeSound();

    }
}
