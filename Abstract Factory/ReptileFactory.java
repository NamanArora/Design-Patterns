package com.company;

public class ReptileFactory extends SpeciesFactory{
    @Override
    public Animal getAnimal(String s) {
        if(s.contentEquals("trex"))
            return new Trex();
        else
            return new Snake();
    }
}
