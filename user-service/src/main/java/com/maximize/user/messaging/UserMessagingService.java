package com.maximize.user.messaging;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserMessagingService implements MessagingService {
   private JmsTemplate jms;

    @Autowired
     UserMessagingService(JmsTemplate jms) {
        this.jms = jms;
    }

    @Override
    public void sendUserMessage(UserMessage userMessage) {
        jms.convertAndSend("user.topic",userMessage);
    }
}
