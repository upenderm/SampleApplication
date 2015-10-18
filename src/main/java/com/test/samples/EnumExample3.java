package com.test.samples;

public class EnumExample3 {

   public enum Languages {
      JAVA(10, "EfficientLanguage"), C(2, "firstPrgLang"), COBOL(1, "businessPurpose"), DOTNET(4, "Microsoftservices"), SAP(6, "businssLead"), ORACLE(9, "DatabaseLang");
      private int rating;
      private String desc;

      private Languages(int rating, String desc) {
         this.rating = rating;
         this.desc = desc;
      }
      
      public String getLanguageDescription(){
         return desc;
      }
      
      public int getLanguageRating(){
         return rating;
      }
   }
   
   public static void main(String[] args) {
      System.out.println(Languages.JAVA);
      System.out.println(Languages.DOTNET.getLanguageRating());
      System.out.println(Languages.ORACLE.getLanguageDescription());

   }

}
