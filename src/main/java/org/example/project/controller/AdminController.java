package org.example.project.controller;

import lombok.RequiredArgsConstructor;
import org.example.project.entity.Course;
import org.example.project.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

    private final CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }
}