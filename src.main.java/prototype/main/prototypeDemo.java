package com.lin.java.prototype.main;

/**
 * Created by never on 1/28/2016.
 */
public class prototypeDemo {
    public static void main(String args[]){
        ConcretePrototype cp = new ConcretePrototype();

        for(int i=0; i< 5; i++){
            try{
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();
                clonecp.show();
            }
            catch (CloneNotSupportedException e){
                e.printStackTrace();
            }

        }
    }
}
