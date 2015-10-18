package com.test.samples.designpatterns.factorypattern;

public class ShapeFactory {

   public Shape drawShape(String shape) {
      if (shape.equals("circle")) {
         return new Circle();
      }
      else if (shape.equals("rectangle")) {
         return new Rectangle();
      }
      else if (shape.equals("square")) {
         return new Square();
      }
      return null;
   }

}
