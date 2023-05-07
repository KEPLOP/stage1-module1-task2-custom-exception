package com.epam.mjc;


public class StudentManager {
  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

  public Student find(long studentID) {
    for (long id : IDs) {
      if (id == studentID) {
        return Student.getValueOf(studentID);
      }
    }
    throw new CustomException(studentID);
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (long id : IDs) {
      try {
        Student student = manager.find(id);
        System.out.println("Student name " + student.getName());
      } catch (CustomException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
