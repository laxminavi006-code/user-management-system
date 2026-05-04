package com.palle1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palle1.Entity.User;
import com.palle1.Repository.UserRepository;
import com.palle1.dto.LoginDto;
import com.palle1.dto.UserDto;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // CREATE
    public User addUser(UserDto dto) {
        User user = new User();

        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setMobile(dto.getMobile());
        user.setAge(dto.getAge());
        user.setNation(dto.getNation());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());

        return repo.save(user);
    }

    // LOGIN
    public String login(LoginDto dto) {
        User user = repo.findByUsername(dto.getUsername());

        if (user != null && user.getPassword().equals(dto.getPassword())) {
            return "Login Successful";
        }
        throw new RuntimeException("Invalid username or password");
    }

    // READ ALL
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    // READ ONE
    public User getUserById(int id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    // UPDATE
    public User updateUser(int id, User newUser) {
        User existing = getUserById(id);

        existing.setName(newUser.getName());
        existing.setEmail(newUser.getEmail());
        existing.setMobile(newUser.getMobile());
        existing.setAge(newUser.getAge());
        existing.setNation(newUser.getNation());

        return repo.save(existing);
    }

    // DELETE
    public String deleteUser(int id) {
        repo.deleteById(id);
        return "User deleted successfully";
    }
}