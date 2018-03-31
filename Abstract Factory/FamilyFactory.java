package com.company;

public class FamilyFactory {

    SpeciesFactory getFactory(String s){
        if(s.contentEquals("reptiles"))
            return new ReptileFactory();
        else
            return new MammalFactory();
    }

}
