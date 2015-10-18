package com.test.samples.reflection;

import java.lang.reflect.Method;

import com.test.samples.model.CitiesList;

public class ReflectionTest {

   public static void main(String[] args) {
      Class cc = CitiesList.class;
      Method[] methods = cc.getMethods();
      for(Method method : methods){
         System.out.println(method.getReturnType().getCanonicalName());
      }
         
   }

}
