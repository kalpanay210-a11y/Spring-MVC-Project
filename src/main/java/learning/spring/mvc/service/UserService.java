package learning.spring.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import learning.spring.mvc.model.User;

@Service
public class UserService {

	List<User> listOfUser = new ArrayList<>();

	public void addUser(User user) {
		
		listOfUser.add(user);
		System.out.println("UserService.addUser()");
		
	}

	public User validateUser(String username, String password) {

		boolean flag = false;
		for (User user : listOfUser) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				
				return user;
			}
		}
       return null;
	}
	
}
