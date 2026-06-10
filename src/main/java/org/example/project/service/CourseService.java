package org.example.project.service;

import lombok.RequiredArgsConstructor;
import org.example.project.entity.Course;
import org.example.project.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }
}
