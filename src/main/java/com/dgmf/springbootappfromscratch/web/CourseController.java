package com.dgmf.springbootappfromscratch.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgmf.springbootappfromscratch.entity.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "Learn Microservices", "Glaz Dodo"),
				new Course(2, "Learn Java", "Glaz Dodo"), new Course(3, "Learn Spring Boot", "Glaz Dodo"),
				new Course(4, "Learn Spring Security", "Glaz Dodo"), new Course(5, "Learn Spring AOP", "Glaz Dodo"));
	}

	@GetMapping("/courses/1")
	public Course getCourseDetails() {
		return new Course(3, "Learn Microservices 3", "Glaz Dodo"); 
	}

}
