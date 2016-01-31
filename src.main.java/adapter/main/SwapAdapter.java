package com.lin.java.adapter.main;

/**
 * Created by never on 2/1/2016.
 */
public class SwapAdapter implements HkSocket{
    private ChinaPlug chinaPlug;
    public SwapAdapter(){
        chinaPlug = new ChinaPlug();
    }

    @Override
    public void charge() {
        chinaPlug.charge();
    }
}
