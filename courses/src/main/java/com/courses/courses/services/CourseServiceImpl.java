package com.courses.courses.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.courses.courses.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(123,"Intro to Java","This contains all the basics of Java..."));
		list.add(new Course(124,"Intro to REST API","This is an intro to rest API in Spring Boot.."));
		
		
	}


	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override 
	public Course getCourseById(long courseId) {
		
		for(Course course : list) {
			if(course.getId() == courseId) {
				return course;
			}
		}
		return null;
	}
	
	public List<Course> getList() {
		return list;
	}

	public void setList(List<Course> list) {
		this.list = list;
	}


	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

}
