package com.epam.mjc;


public class StudentManager {
  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) {
    for (long id : IDs) {
      if (id == studentID) {
        return Student.getValueOf(studentID);
      }
    }
    throw new CustomException (studentID);
  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    Student student = manager.find(3);
    System.out.println("Student name " + student.getName());
    Student studentNotFound = manager.find(13);

  }
}

