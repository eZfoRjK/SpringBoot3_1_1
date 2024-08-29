package com.kataexample.SpringBoot3_1_1.dao;

import com.kataexample.SpringBoot3_1_1.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUser(Long id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
}
