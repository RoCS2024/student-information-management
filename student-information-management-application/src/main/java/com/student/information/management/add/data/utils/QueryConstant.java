package com.student.information.management.add.data.utils;
/**
 * This is the Query Constant for Student.
 */
public class QueryConstant {
    private QueryConstant() {
    }

    public static final String GET_ALL_STUDENTS_STATEMENT = "SELECT * FROM STUDENT";
    public static final String GET_STUDENT_BY_STUDENT_ID_STATEMENT = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";
    public static final String ADD_STUDENT_STATEMENT = "INSERT INTO STUDENT VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
}
