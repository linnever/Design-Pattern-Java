package com.lin.java.object_pool.main;

/**
 * Created by never on 1/28/2016.
 */
public class Oliphaunt {
    private static int counter = 1;

    private final int id;

    /**
     * Constructor
     */
    public Oliphaunt() {
        id = counter++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Oliphaunt id=%d", id);
    }

}
