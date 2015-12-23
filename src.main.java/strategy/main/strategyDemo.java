package com.lin.java.strategy.main;

/**
 * Created by never on 12/21/2015.
 */
public class strategyDemo {
    public static void main(String args[]){
        context context = new context((new operationAdd()));
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        context = new context(new operationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new context(new operationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
