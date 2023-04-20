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
		return Arrays.asList(new Course(1, "Learn Microservices", "Glaz Dodo"));
	}
	

}
