package com.maximize.userSrvc.controller;

import com.maximize.userSrvc.model.User;
import com.maximize.userSrvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "maximize", produces = "application/json")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/userSrvc")
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/users")
    public Iterable<User> getUsers()  {
        return userRepository.findAll();
    }
}
