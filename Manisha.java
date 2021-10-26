package com.manisha1;

public class Manisha {
    public int pub = 32;
    protected int pro = 43;
    int def = 65;
    private int  pri = 90;

    public void meth1(){
        System.out.println("Public:- "+pub);
        System.out.println("Protected:- "+pro);
        System.out.println("Default:- "+def);
        System.out.println("Private:- "+pri);
    }
    public static void main(String[] args) {
        System.out.println("I am Class Manisha");

    }

}