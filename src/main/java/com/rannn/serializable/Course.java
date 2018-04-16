package com.rannn.serializable;

import java.io.Serializable;

public class Course implements Serializable {

    private static final long serialVersionUID = -714428169058260456L;

    private static String courseName;
    private int credit;

    public Course(String courseName, int credit) {
        this.courseName = courseName;
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course Object courseName:" + courseName + " credit:" + credit;
    }
}
