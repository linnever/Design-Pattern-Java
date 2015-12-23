package com.lin.java.singleton.main;

/**
 * Created by never on 12/24/2015.
 * Lazy Instantiation using double locking mechanism
 **************************************************
 * the standard implementation shown in the above code is a thread safe implementation,but it's not the best thread-safe implementation
 * because synchronization is very expensive when we are talking about the performance.
 * We can see that the synchronized method getInstance does not need to be checked for synchronization after the object is initialized.
 * If we see that the singleton object is already created we just have to return it without using any synchronized block.
 * This optimization consist in checking in an unsynchronized block if the object is null and if not to check again and create it in an synchronized block.
 * This is called double locking mechanism.
 * *************************************************
 */
public class Singleton {
    private static Singleton instance;//lazy Initializing
    private  Singleton(){
        System.out.println("Singleton():Initializing Instance");
    }
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    System.out.println("getInstance():First time getInstance was invoked!");
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public void doSomething(){
        System.out.println("doSomething(): Singleton does something!");
    }
}
