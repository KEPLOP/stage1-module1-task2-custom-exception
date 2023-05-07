package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {
    private long studentId;

    public StudentNotFoundException(long studentId) {
        super();
        this.studentId = studentId;
    }

    @Override
    public String getMessage() {
        return "Could not find student with ID " + studentId;
    }
}
