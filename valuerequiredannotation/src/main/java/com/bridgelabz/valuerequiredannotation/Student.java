package com.bridgelabz.valuerequiredannotation;

//import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;


public class Student {

	@Value("${student.name}")
	private String name;
	@Value("${student.interestedCourse}")
	private String interestedCourse;
	@Value("${student.hobby}")
	private String hobby;

////	@Value("${student.name}")
//	public void setName(String name) {
//		this.name = name;
//	}
//
////	@Required
////	@Value("${student.interestedCourse}")
//	public void setInterestedCourse(String interestedCourse) {
//		this.interestedCourse = interestedCourse;
//	}
//
////	@Value("${student.hobby}")
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//	}

	public void displayStudentInfo() {
		System.out.println("Student name: " + name);
		System.out.println("Student Course: " + interestedCourse);
		System.out.println("Student Hobby: " + hobby);
	}
}
