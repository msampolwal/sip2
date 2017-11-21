package com.msw.thebar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.msw.thebar.model.Rol;
import com.msw.thebar.model.User;

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

	public User getUserPorEmail(User user) {
		for (User u : users) {
			if(u.getEmail().equals(user.getEmail()))
				return u;
		}
		return null;
	}
	
	public User createUser(User user){
		if(getUserPorEmail(user) == null) {
			User c = new User();
			c.setId(Long.valueOf(counter.incrementAndGet()).intValue());
			c.setNombre(user.getNombre());
			c.setApellido(user.getApellido());
			c.setEmail(user.getEmail());
			c.setPassword(user.getPassword());
			c.setPuntosAcumulados(50);
			c.setRol(new Rol(2, "Cliente"));
			users.add(c);
			return c;
		}
		return null;
	}
	
	private static List<User> loadUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new User(Long.valueOf(counter.incrementAndGet()).intValue(), "Carlos", "Lopez", "dueno@gmail.com", "1234", 150, new Rol(1, "Dueno")));
		users.add(new User(Long.valueOf(counter.incrementAndGet()).intValue(), "Pablo", "Garcia","cliente@gmail.com", "1234", 50, new Rol(2, "Cliente")));
		return users;
	}
}