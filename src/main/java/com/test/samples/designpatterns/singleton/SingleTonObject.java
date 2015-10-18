package com.test.samples.designpatterns.singleton;

public class SingleTonObject {
   
   private static SingleTonObject stdemo = null;
   
   private SingleTonObject(){
      System.out.println("In constructor:SingleTonObject");
   }
   
   public static SingleTonObject getInstance(){
      System.out.println("stdemo is :"+stdemo);
      if(stdemo == null){
         stdemo = new SingleTonObject();
      }
      return stdemo;
   }
   
   public void getDBConnection(){
      System.out.println("In getDBConnection");
   }

}
