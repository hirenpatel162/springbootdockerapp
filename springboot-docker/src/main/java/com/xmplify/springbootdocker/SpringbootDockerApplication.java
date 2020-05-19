package com.xmplify.springbootdocker;

import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.xmplify.springbootdocker.entity.User;
import com.xmplify.springbootdocker.repository.UserRepository;

@SpringBootApplication
public class SpringbootDockerApplication implements CommandLineRunner {

	@Autowired
	DataSource dataSource;
	
	@Autowired
	UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DataSource is::" + dataSource);
		List<User> userList =getUserList();
		userRepository.saveAll(userList);
		System.out.println("INITIAL DATA SAVED");
	}
	
	public List<User> getUserList(){
		List<User> userList = Arrays.asList(new User("hiren","patel","hiren.patel@gmail.com"),
				new User("dipika","patel","dipika.patel@gmail.com"));
		return userList;
	}

}
