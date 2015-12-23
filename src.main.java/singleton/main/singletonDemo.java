package com.lin.java.singleton.main;

/**
 * Created by never on 12/24/2015.
 */
public class singletonDemo {
    public static void main(String [] args){
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
