package com.tinymood.javase.serializable;

import java.io.Serializable;

public class Student implements Serializable {
	private String name;
	private transient int age;
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
		return "Student Object name:"+this.name+" age:"+this.age; 
	}
}
