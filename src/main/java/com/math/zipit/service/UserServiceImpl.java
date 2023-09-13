package com.math.zipit.service;

import com.math.zipit.model.User;
import com.math.zipit.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long userId) {
        if (userRepository.findById(userId).isPresent())
            return userRepository.findById(userId).get();
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
