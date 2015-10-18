package com.test.samples;

public enum EnumTest {

   MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);
   
   private int dayNum;

   private EnumTest(int value) {
      this.dayNum = value;
   }
   
   public int getDayNum(){
      return dayNum;
   }

   public static void main(String[] args) {
      System.out.println(EnumTest.MONDAY.getDayNum());
      System.out.println(EnumTest.values());
      EnumTest[] d = EnumTest.values();
      for(int i=0;i<d.length;i++){
         System.out.println(d[i]+"<<<<>>>>:"+d[i].getDayNum());
      }
   }
   
}
