package com.test.samples.designpatterns.proxypattern;

public class ProxyPatternDemo {

   public static void main(String[] args) {
      Image image = new ProxyImage("Abc.text");
      image.display();
      System.out.println("------------------------------");
      image.display();
   }

}
