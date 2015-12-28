package com.lin.java.abstract_factory.main;

/**
 * Created by never on 12/29/2015.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}