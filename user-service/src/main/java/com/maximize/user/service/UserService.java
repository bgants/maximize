package com.maximize.user.service;

import com.maximize.user.messaging.MessagingService;
import com.maximize.user.messaging.UserMessage;
import com.maximize.user.model.User;
import com.maximize.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    MessagingService userMessagingService;

    @Transactional
    //https://dzone.com/articles/transaction-synchronization-and-spring-application
    public User saveUser(User user) {
        User newUser =  userRepository.save(user);

        UserMessage message = new UserMessage();
        message.setMessage("User " + newUser.getUserName() + " created");
        userMessagingService.sendUserMessage(message);

        return newUser;
    }

    public Iterable<User> getUsers()  {
        return userRepository.findAll();
    }

}
