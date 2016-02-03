package com.lin.java.proxy.main;

/**
 * Created by never on 2/3/2016.
 */
public class ProxyDemo {
    public static void main(String args[]){

        Image highResolutionImage1 = new ImageProxy("sample/veryHighResPhoto1.jpeg");
        Image highResolutionImage2 = new ImageProxy("sample/veryHighResPhoto2.jpeg");
        Image highResolutionImage3 = new ImageProxy("sample/veryHighResPhoto3.jpeg");
        highResolutionImage1.showImage();
        Image highResolutionImageNoProxy1 = new HighResolutionImage("sample/veryHighResPhoto1.jpeg");
        Image highResolutionImageNoProxy2 = new HighResolutionImage("sample/veryHighResPhoto2.jpeg");
        Image highResolutionImageBoProxy3 = new HighResolutionImage("sample/veryHighResPhoto3.jpeg");
        // assume that the user selects image two item from images list
        highResolutionImageNoProxy2.showImage();

        // note that in this case all images have been loaded into memory
        // and not all have been actually displayed
        // this is a waste of memory resources
    }
}
