package com.example.postgresdemo.controller;

import com.example.postgresdemo.model.Role;
import com.example.postgresdemo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/role")
    public List<Role> getRoles() {
        return roleRepository.findAll();
    }

    @PostMapping("/role")
    public Role createUser(@Valid @RequestBody Role role) {
        return roleRepository.save(role);
    }
}
