package com.test.samples.designpatterns.daopattern;

public class DAOPatternDemo {

   public static void main(String[] args) {
      StudentDAO stdao = new StudentDAOImpl();
      System.out.println("All students...............");
      for (Student std : stdao.getAllStudents()) {
         System.out.println(std.getStudentId() + "\t" + std.getStudentName());
      }

      System.out.println("Update Student...........");
      String result = stdao.updateStudent(new Student(10, "Mohanlal"));
      System.out.println("Update Result :"+result);

      System.out.println("Student details...........");
      Student std = stdao.getStudentDetails(2);
      System.out.println(std.getStudentId() + "\t" + std.getStudentName());
      
      System.out.println("Delete student................");
      String result2 = stdao.deleteStudent(new Student(10,""));
      System.out.println("Result :"+result2);
      
      System.out.println("All students...............");
      for (Student std2 : stdao.getAllStudents()) {
         System.out.println(std2.getStudentId() + "\t" + std2.getStudentName());
      }
   }

}
