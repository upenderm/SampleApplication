package com.test.samples.designpatterns.singleton;

public class SingleTonDemo {

   public static void main(String[] args) {
      SingleTonObject.getInstance().getDBConnection();
      SingleTonObject.getInstance().getDBConnection();
      SingleTonObject.getInstance().getDBConnection();
   }

}
