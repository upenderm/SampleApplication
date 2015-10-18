package com.test.samples.designpatterns.abstractfactory;

public class AbstractFactoryPatternDemo {

   public static void main(String[] args) {
      AbstractFactory shapeFactory = AbstractFactoryProducer.getFactory("Shape");
      
      Shape circle = shapeFactory.getShape("Circle");
      circle.draw();
      
      Shape square = shapeFactory.getShape("Square");
      square.draw();
      
      Shape rectangle = shapeFactory.getShape("Rectangle");
      rectangle.draw();

      AbstractFactory colorFactory = AbstractFactoryProducer.getFactory("Color");
      
      Color red = colorFactory.getColor("Red");
      red.fill();

      Color green = colorFactory.getColor("Green");
      green.fill();

      Color blue = colorFactory.getColor("Blue");
      blue.fill();

   }

}
