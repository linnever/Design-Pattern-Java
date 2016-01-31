package com.lin.java.adapter.main;

/**
 * Created by never on 2/1/2016.
 *
 */
public class adpaterDemo {
    public static void  main(String args[]) {
        HongkongHotel hkHotal = new HongkongHotel(new SwapAdapter());
        hkHotal.charge();
    }
}

