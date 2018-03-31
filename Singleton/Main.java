package com.company;

public class Main {
    public static int a;

    public static void main(String[] args) {
	// write your code here
    Eager eager1 = Eager.getInstance();
    Eager eager2 = Eager.getInstance();



    if(eager1.hashCode() == eager2.hashCode())
        System.out.println("Same hashes of eager");

    //Lazy l1= new Lazy.getInstance();


    Lazy l1 = Lazy.getInstance();
    Lazy l2 = Lazy.getInstance();

    if(l1.hashCode() == l2.hashCode())
            System.out.println("Same hashes of lazy");

    }
}
