package com.rannn.serializable;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = -7829571126539221153L;

    private String name;
    private transient int age;

    //sex字段测试serialVersionUID
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student Object name:" + this.name + " age:" + this.age;
    }
}
