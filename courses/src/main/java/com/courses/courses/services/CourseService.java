package com.courses.courses.services;

import java.util.List;

import com.courses.courses.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	public Course getCourseById(long courseId);
	public Course addCourse(Course course);
}
