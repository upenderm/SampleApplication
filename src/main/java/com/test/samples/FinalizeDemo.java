package com.test.samples;

import java.util.GregorianCalendar;

public class FinalizeDemo extends GregorianCalendar {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;

   public static void main(String[] args) {
      try {
         FinalizeDemo cal = new FinalizeDemo();
         System.out.println("" + cal.getTime());
         System.out.println("Finalizing...");
         cal.finalize();
         System.out.println("Finalized.");
      }
      catch (Throwable ex) {
         ex.printStackTrace();
      }

   }

}
