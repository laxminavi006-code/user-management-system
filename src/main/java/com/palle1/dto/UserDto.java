package com.palle1.dto;

import jakarta.validation.constraints.*;

public class UserDto {

    @NotNull(message = "Name cannot be null")
    private String name;

    @Email(message = "Invalid email")
    private String email;

    @Pattern(regexp = "^\\d{10}$", message = "Mobile must be 10 digits")
    private String mobile;

    @Min(18)
    @Max(60)
    private int age;

    @NotEmpty(message = "Nation cannot be empty")
    private String nation;

    @NotEmpty(message = "Username required")
    private String username;

    @NotEmpty(message = "Password required")
    private String password;

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getNation() { return nation; }
    public void setNation(String nation) { this.nation = nation; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}