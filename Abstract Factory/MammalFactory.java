package com.company;

public class MammalFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String s) {
        if(s.equals("dog"))
            return new Dog();
        else
            return new Cat();
    }

}
