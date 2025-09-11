package com.JobPortal.JobPortal.controller;

import com.JobPortal.JobPortal.model.User;
import com.JobPortal.JobPortal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    // Explicitly consume JSON to avoid 415 error
    @PostMapping(value = "/register", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public User register(@RequestBody User user) {
        return service.saveUser(user);
    }
}
