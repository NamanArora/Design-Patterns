package com.company;

public class SocketAdapterImpl extends Socket implements SocketAdapter {

    public void print()
    {
        System.out.println("hello");
    }

    @Override
    public Volt get3volt() {
        //take voltage from socket and covert it
        Volt t = getVolt();
        return convert(t,40);
    }

    @Override
    public Volt get15volt() {
        Volt t = getVolt();
        return convert(t,8);
    }

    @Override
    public Volt get120volt() {
        Volt t = getVolt();
        return t;
    }

    public Volt convert(Volt s, int factor)
    {
        return new Volt(s.getVolt()/factor);
    }
}
