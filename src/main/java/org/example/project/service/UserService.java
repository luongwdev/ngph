package org.example.project.service;

import lombok.RequiredArgsConstructor;
import org.example.project.dto.RegisterRequest;
import org.example.project.entity.User;
import org.example.project.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User register(RegisterRequest request) {

        User user = new User();
        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        return userRepository.save(user);
    }
}
