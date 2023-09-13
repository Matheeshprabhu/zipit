package com.math.zipit.controller;

import com.math.zipit.model.User;
import com.math.zipit.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<Object> getUser(@PathVariable Long userId){
        User user = userService.getUser(userId);
        if(user == null)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not present");
        return ResponseEntity.ok(user);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        for(User i: userService.getAllUsers())
            System.out.println(i);
        return userService.getAllUsers();
    }

}
