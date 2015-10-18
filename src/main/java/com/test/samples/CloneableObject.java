package com.test.samples;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneableObject implements Cloneable, Serializable {

   private Integer empId;
   private String empName;
   private CloneableSubObject cso;

   @Override
   protected Object clone() throws CloneNotSupportedException {
      return super.clone();
   }

   public CloneableObject deepClone() {
      CloneableObject co = null;
      try {
         ByteArrayOutputStream baos = new ByteArrayOutputStream();
         ObjectOutputStream oos = new ObjectOutputStream(baos);
         oos.writeObject(this);

         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         ObjectInputStream ois = new ObjectInputStream(bais);
         co = (CloneableObject) ois.readObject();
      }
      catch (IOException e) {
      }
      catch (ClassNotFoundException cd) {

      }
      return co;
   }

   @Override
   public int hashCode() {
      return empId.hashCode();
   }

   @Override
   public boolean equals(Object o) {
      CloneableObject co = (CloneableObject) o;
      if (this.empId == co.empId && this.empName.equals(co.empName)) {
         return true;
      }
      return false;
   }

   public Integer getEmpId() {
      return empId;
   }

   public void setEmpId(Integer empId) {
      this.empId = empId;
   }

   public String getEmpName() {
      return empName;
   }

   public void setEmpName(String empName) {
      this.empName = empName;
   }

   public CloneableSubObject getCso() {
      return cso;
   }

   public void setCso(CloneableSubObject cso) {
      this.cso = cso;
   }

}
