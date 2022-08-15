package com.kata.springboot.pp_3_1_1.services;

import com.kata.springboot.pp_3_1_1.models.User;

import java.util.List;

public interface UserService {
    List<User> showAllUsers();
    User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);
}
