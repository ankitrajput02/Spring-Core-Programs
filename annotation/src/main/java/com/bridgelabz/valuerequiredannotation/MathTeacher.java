package com.bridgelabz.valuerequiredannotation;


import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Math Teacher");
	}
}