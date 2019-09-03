package com.maximize.user.repository;

import com.maximize.user.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    public void givenUserAddToDatabaseAndRetrieve() {
        User user	= new User();
        user.setUserName("bgants@maximize.com");

        userRepository.save(user);

        User testUser =  userRepository.findByUserName("bgants@maximize.com");
        assert testUser.getUserName().equals(user.getUserName());
    }
}
