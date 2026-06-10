package org.example.project.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.project.dto.ApiResponse;
import org.example.project.dto.EnrollmentRequest;
import org.example.project.dto.EnrollmentResponse;
import org.example.project.service.EnrollmentService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final EnrollmentService enrollmentService;

    @PostMapping("/enroll")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<EnrollmentResponse> enroll(@Valid @RequestBody EnrollmentRequest request) {
        return ApiResponse.success("Đăng ký khóa học thành công", enrollmentService.enroll(request));
    }

    @GetMapping("/{studentId}/courses")
    public ApiResponse<List<EnrollmentResponse>> getEnrolledCourses(@PathVariable Long studentId) {
        return ApiResponse.success(enrollmentService.getEnrollmentsByStudent(studentId));
    }
}
