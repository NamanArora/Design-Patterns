package com.company;

public class AnimalFactory {
    public Animal getAnimal(String s)
    {
        if(s.equalsIgnoreCase("cat"))
            return new Cat();
        else
            return new Dog();
    }
}
