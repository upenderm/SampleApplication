package com.test.samples;

public class EnumExample {

   Countries countries;

   public enum Countries {
      INDIA, PAKISTAN, SRILANKA, BHUTAN, CHINA, BANGLADESH;
   }

   public EnumExample(Countries countries) {
      this.countries = countries;
   }

   public void countryDetails() {
      switch (countries) {
         case INDIA:
            System.out.println("In India switch case");
            break;
         case PAKISTAN:
            System.out.println("In Pakistan switch case");
            break;
         case CHINA:
            System.out.println("In India switch case");
         case SRILANKA:
            System.out.println("In sRILANKA switch case");
         case BHUTAN:
            System.out.println("In bhutan switch case");
         case BANGLADESH:
            System.out.println("In bangladesh switch case");
         default:
            break;
      }
   }

   public static void main(String[] args) {
      EnumExample ee = new EnumExample(Countries.BANGLADESH);
      System.out.println(Countries.BANGLADESH);
      ee.countryDetails();
   }

}
