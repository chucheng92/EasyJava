package com.tinymood.javase.serializable;

import java.io.Serializable;

public class Course implements Serializable {
	private static String courseName;
	private int credit;
	
	public Course(String courseName, int credit) {
		this.courseName = courseName;
		this.credit = credit;
	}
	
	@Override
	public String toString() {
		return "Course Object courseName:"+courseName+" credit:"+credit; 
	}
}
