package com.math.zipit.service;

import com.math.zipit.model.User;

public interface UserService {

    User saveUser(User user);
    User getUser(Long userId);

}
