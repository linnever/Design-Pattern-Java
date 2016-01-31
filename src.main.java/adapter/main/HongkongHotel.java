package com.lin.java.adapter.main;
/**
 * Created by never on 2/1/2016.
 */
public class HongkongHotel implements HkSocket{
    private HkSocket hkSocket;
    public HongkongHotel(){

    }
    public HongkongHotel(HkSocket hkSocket){
        this.hkSocket=hkSocket;
    }
    public  void setHkSocket(HkSocket hkSocket){
        this.hkSocket=hkSocket;
    }

    @Override
    public void charge(){
       hkSocket.charge();
    }
}
