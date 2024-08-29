package com.kataexample.SpringBoot3_1_1.service;

import com.kataexample.SpringBoot3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);
    User getUserById(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
}
