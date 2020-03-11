package com.bridgelabz.valuerequiredannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.valuerequiredannotation")
@PropertySource("classpath:college-info.properties") //
public class CollegeConfiguration {
	/*
	 * @Bean public Teacher MathTeacherBean() { return new MathTeacher(); }
	 * 
	 * // @Bean(name = {"ColBean","CollegeBean"} )
	 * 
	 * @Bean public principal principalBean() { return new principal2(); }
	 * 
	 * @Bean public College collegeBean() { // College college = new
	 * College(principalBean());// Principal bean by a setter injection College2
	 * college = new College(); college.setPrincipal(principalBean());
	 * college.setTeacher(MathTeacherBean()); return college; }
	 */
}