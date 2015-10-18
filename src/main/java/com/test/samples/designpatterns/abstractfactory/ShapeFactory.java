package com.test.samples.designpatterns.abstractfactory;

public class ShapeFactory extends AbstractFactory {

   @Override
   public Shape getShape(String shapeType) {
      if (shapeType.equals("Circle")) {
         return new Circle();
      }
      else if (shapeType.equals("Square")) {
         return new Square();
      }
      else if (shapeType.equals("Rectangle")) {
         return new Rectangle();
      }
      return null;
   }

   @Override
   public Color getColor(String color) {

      return null;
   }

}
