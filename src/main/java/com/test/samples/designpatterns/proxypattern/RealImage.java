package com.test.samples.designpatterns.proxypattern;

public class RealImage implements Image{

   private String fileName;
   
   public RealImage(String fileName){
      this.fileName = fileName;
      loadImageFromDisk(fileName);
   }
   
   private void loadImageFromDisk(String fileName2) {
      System.out.println("Loading :"+fileName2);
      
   }

   public void display() {
      System.out.println("RealImage:display()::Displaying :"+fileName);
      
   }

}
