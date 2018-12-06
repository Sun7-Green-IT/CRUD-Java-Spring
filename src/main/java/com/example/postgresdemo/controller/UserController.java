package com.example.postgresdemo.controller;

import com.example.postgresdemo.exception.ResourceNotFoundException;
import com.example.postgresdemo.model.Role;
import com.example.postgresdemo.model.User;
import com.example.postgresdemo.repository.UserRepository;
import com.example.postgresdemo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/helloworld")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/user")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }
}
