package com.math.zipit.service;

import com.math.zipit.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User getUser(Long userId);

    List<User> getAllUsers();

}
