package com.test.samples.model;

public class Fruits {

   private Integer quantity;
   private String fruitName;

   public Fruits(Integer quantity, String fruitName) {
      this.quantity = quantity;
      this.fruitName = fruitName;
   }

   @Override
   public int hashCode() {
      return quantity.hashCode();
   }
   
   @Override
   public boolean equals(Object o) {
      Fruits f = (Fruits) o;
      if(this.quantity == f.quantity && this.fruitName.equals(f.fruitName))
         return true;
      return false;
   }

   public Integer getQuantity() {
      return quantity;
   }

   public void setQuantity(Integer quantity) {
      this.quantity = quantity;
   }

   public String getFruitName() {
      return fruitName;
   }

   public void setFruitName(String fruitName) {
      this.fruitName = fruitName;
   }

}
