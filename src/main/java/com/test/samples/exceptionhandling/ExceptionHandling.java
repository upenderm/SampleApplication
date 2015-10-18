package com.test.samples.exceptionhandling;

public class ExceptionHandling {

   public static void main(String[] args) throws Exception {
      ExceptionHandling eh = new ExceptionHandling();
      System.out.println(">>----->" + eh.test());

   }

   private Integer test() throws Exception{
      Integer result=0;
      try {
         result=2;
         throw new Exception();
//         return result=2;    // compile error... unreachable code... even a sysout will not work here
      }
      catch (Exception e) {
         result=3;
         System.out.println("result is :"+result);
         throw new Exception();
      }
      finally{
         result = 4;
         return 5;
      }

   }
public String test2() throws Exception{
   throw new Exception();
}
}
