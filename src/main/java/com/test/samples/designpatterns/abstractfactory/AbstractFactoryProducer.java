package com.test.samples.designpatterns.abstractfactory;

public class AbstractFactoryProducer {

   public static AbstractFactory getFactory(String choice) {
      if (choice.equals("Shape")) {
         return new ShapeFactory();
      }
      if (choice.equals("Color")) {
         return new ColorFactory();
      }
      return null;
   }

}
