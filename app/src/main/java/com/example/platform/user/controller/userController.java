package com.example.platform.user.controller;

import com.example.platform.user.model.User;
import com.example.platform.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class userController {
    @Autowired
    UserService userService;
    @GetMapping("/login")
    public boolean insertUser(User user){
        userService.insert(user);
        return true;
    }
}
