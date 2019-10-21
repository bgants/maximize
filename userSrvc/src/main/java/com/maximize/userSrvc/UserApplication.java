package com.maximize.userSrvc;

import com.maximize.userSrvc.model.User;
import com.maximize.userSrvc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}

}


//Seeds the database with basic data will need to be removed as complexity increases.
@Component
class DemoUserSrvc implements CommandLineRunner {
	@Autowired
	UserRepository repository;

	@Override
	public void run(String... args) throws Exception {

		List<User> userList = Arrays.asList(
			new User().withUserName("Joe Blow"),
			new User().withUserName("Jim Bob"),
			new User().withUserName("Polly Anna"),
			new User().withUserName("Humpty Dumpty"),
			new User().withUserName("Snow White"),
			new User().withUserName("Rumpple Stillskin"),
			new User().withUserName("Thom Thumb")
		);

		userList.stream().forEach(user -> repository.save(user));

	}
}
