package com.test.samples.designpatterns.abstractfactory;

public class ColorFactory extends AbstractFactory {

   @Override
   public Shape getShape(String shapeType) {
      return null;
   }

   @Override
   public Color getColor(String color) {
      if (color.equals("Red")) {
         return new Red();
      }
      else if (color.equals("Green")) {
         return new Green();
      }
      else if (color.equals("Blue")) {
         return new Blue();
      }
      return null;
   }

}
