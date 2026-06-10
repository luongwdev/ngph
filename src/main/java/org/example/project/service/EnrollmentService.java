package org.example.project.service;

import org.example.project.dto.EnrollmentRequest;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {

    public String enroll(EnrollmentRequest request) {

        return "Student " + request.getStudentId()
                + " joined course "
                + request.getCourseId();
    }
}