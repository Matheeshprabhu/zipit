package com.math.zipit.controller;

import com.math.zipit.model.User;
import com.math.zipit.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("user")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId){
        return userService.getUser(userId);
    }

}
