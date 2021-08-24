package com.codewithcup.microservice.UserService.controller;

import com.codewithcup.microservice.UserService.entity.User;
import com.codewithcup.microservice.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User gettingUser(@PathVariable("userId") Long userId) {

        User user = this.userService.getUser(userId);
        List contact = this.restTemplate.getForObject("http://Contact-Service/contacts/user/" + user.getUserId(), List.class);
        user.setContact(contact);
        return user;

    }


}
