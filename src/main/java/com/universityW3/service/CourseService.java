package com.universityW3.service;

import com.universityW3.model.Course;
import org.springframework.stereotype.Service;

public interface CourseService {

    public void deleteCourse(Course course);
    public void createCourse(Course course);
    public void updateCourse(Course course);
    public Course findCourse(String name);
}
