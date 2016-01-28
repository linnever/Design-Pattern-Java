package com.lin.java.object_pool.main;

/**
 * Created by never on 1/28/2016.
 */
public class OliphauntPool  extends ObjectPool<Oliphaunt> {

    @Override
    protected Oliphaunt create() {
        return new Oliphaunt();
    }
}