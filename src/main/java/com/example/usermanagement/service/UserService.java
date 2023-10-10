package com.example.usermanagement.service;

import com.example.usermanagement.dto.UserDto;
import com.example.usermanagement.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto getUserById(Long id);
    List<UserDto> getAllUsers();
    UserDto updateUser(UserDto user);
    void deleteUser(Long id);
}
