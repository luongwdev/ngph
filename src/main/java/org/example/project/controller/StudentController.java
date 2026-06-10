package org.example.project.controller;

import lombok.RequiredArgsConstructor;
import org.example.project.dto.EnrollmentRequest;
import org.example.project.service.EnrollmentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final EnrollmentService enrollmentService;

    @PostMapping("/enroll")
    public String enroll(@RequestBody EnrollmentRequest request) {
        return enrollmentService.enroll(request);
    }
}