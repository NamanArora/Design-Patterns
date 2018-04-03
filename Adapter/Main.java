package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //an interface parent can call only its own methods not the class'
        SocketAdapter adapter = new SocketAdapterImpl();
        Volt v3 = adapter.get3volt();
        Volt v10 = adapter.get15volt();
        Volt v120 = adapter.get120volt();
        System.out.println("v3: "+v3.getVolt());
        System.out.println("v10: "+v10.getVolt());
        System.out.println("v120: "+v120.getVolt());
    }
}
