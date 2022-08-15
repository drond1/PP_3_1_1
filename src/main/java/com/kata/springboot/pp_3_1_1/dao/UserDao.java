package com.kata.springboot.pp_3_1_1.dao;

import com.kata.springboot.pp_3_1_1.models.User;

import java.util.List;

public interface UserDao {
    List<User> showAllUsers();
    User showUser(int id);
    void saveUser(User user);
    void updateUser(int id, User updatedUser);
    void deleteUser(int id);
}
