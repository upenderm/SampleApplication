package com.test.samples.designpatterns.daopattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
   List<Student> studentsList = new ArrayList<Student>();
   
   public StudentDAOImpl(){
      studentsList.add(new Student(1, "Ramu"));
      studentsList.add(new Student(2, "Suresh"));
      studentsList.add(new Student(3, "Gopi"));
      studentsList.add(new Student(4, "Raina"));
   }

   public List<Student> getAllStudents() {
      
      return studentsList;
   }

   public Student getStudentDetails(Integer studentId) {
      return studentsList.get(studentId-1);
   }

   public String updateStudent(Student student) {
      
      return "success";
   }

   public String deleteStudent(Student student) {
      studentsList.remove(student.getStudentId());
      return "deleted";
   }

}
