package com.lin.java.proxy.main;

/**
 * Created by never on 2/3/2016.
 */
public class HighResolutionImage implements  Image{
    String imageFilePath;
    public HighResolutionImage(String imageFilePath){
        this.imageFilePath = imageFilePath;
        loadImage(imageFilePath);
    }
    private void loadImage(String imageFilePath){
        System.out.println("load ——"+imageFilePath+" —— from disk into memory");
    }
    @Override
    public void showImage(){
        System.out.println("show actual image——"+imageFilePath);
    }
}
