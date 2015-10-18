package com.test.samples.designpatterns.daopattern;

import java.util.List;

public interface StudentDAO {
   
   public List<Student> getAllStudents();
   public Student getStudentDetails(Integer studentId);
   public String updateStudent(Student student);
   public String deleteStudent(Student student);

}
