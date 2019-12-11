package com.maximize.user.controller;

import com.maximize.user.messaging.MessagingService;
import com.maximize.user.messaging.UserMessage;
import com.maximize.user.model.User;
import com.maximize.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "maximize", produces = "application/json")
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    MessagingService userMessagingService;

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
        UserMessage message = new UserMessage();
        message.setMessage("Hello from userService");
        userMessagingService.sendUserMessage(message);
        return userRepository.save(user);
    }

    @GetMapping("/users")
    public Iterable<User> getUsers()  {
        return userRepository.findAll();
    }
}
