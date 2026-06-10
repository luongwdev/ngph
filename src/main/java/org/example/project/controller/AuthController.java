package org.example.project.controller;

import lombok.RequiredArgsConstructor;
import org.example.project.dto.RegisterRequest;
import org.example.project.entity.User;
import org.example.project.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody RegisterRequest request) {
        return userService.register(request);
    }
}
