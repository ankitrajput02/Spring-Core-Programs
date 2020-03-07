package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is a convenience annotation that is equivalent to
 * declaring @Configuration, @EnableAutoConfiguration and @ComponentScan.
 *
 */
@SpringBootApplication
public class SpringIocDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIocDemoApplication.class, args);
	}

}
