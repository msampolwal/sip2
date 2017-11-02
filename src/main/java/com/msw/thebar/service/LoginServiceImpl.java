package com.msw.thebar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.msw.thebar.model.User;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	private static final AtomicLong counter = new AtomicLong();
	private static List<User> users;
	
	static{
		users= loadUsers();
	}
	
	public User getUser(User user) {
		for (User u : users) {
			if(u.getEmail().equals(user.getEmail()) && u.getPassword().equals(user.getPassword()))
				return u;
		}
		return null;
	}

	public User createUser(User user) {
		throw new NotImplementedException();
	}
	
	private static List<User> loadUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(Long.valueOf(counter.incrementAndGet()).intValue(),"dueno@gmail.com", "1234"));
		users.add(new User(Long.valueOf(counter.incrementAndGet()).intValue(),"cliente@gmail.com", "1234"));
		return users;
	}
}