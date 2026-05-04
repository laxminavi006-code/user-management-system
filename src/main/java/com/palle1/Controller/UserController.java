package com.palle1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.palle1.Entity.User;
import com.palle1.Service.UserService;
import com.palle1.dto.LoginDto;
import com.palle1.dto.UserDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/add")
    public User addUser(@RequestBody @Valid UserDto dto) {
        return service.addUser(dto);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginDto dto) {
        return service.login(dto);
    }

    @PostMapping("/logout")
    public String logout() {
        return "Logout successful";
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return service.getUserById(id);
    }

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return service.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return service.deleteUser(id);
    }
}