package com.test.samples.designpatterns.proxypattern;

public class ProxyImage implements Image {

   private RealImage realImage;
   private String fileName;

   public void display() {
      
      if (realImage == null) {
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }

   public ProxyImage(String fileName) {
      this.fileName = fileName;
   }

}
