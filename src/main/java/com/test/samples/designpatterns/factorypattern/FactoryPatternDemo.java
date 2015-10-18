package com.test.samples.designpatterns.factorypattern;

public class FactoryPatternDemo {

   public static void main(String[] args) {
      ShapeFactory factory = new ShapeFactory();
      Shape shape = factory.drawShape("rectangle");
      shape.draw();
      Shape shape2 = factory.drawShape("square");
      shape2.draw();
      Shape shape3 = factory.drawShape("circle");
      shape3.draw();
   }

}
