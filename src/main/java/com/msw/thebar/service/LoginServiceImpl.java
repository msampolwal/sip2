package com.msw.thebar.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.msw.thebar.model.Cliente;
import com.msw.thebar.model.Dueno;
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
			Cliente c = new Cliente();
			c.setId(Long.valueOf(counter.incrementAndGet()).intValue());
			c.setNombre(user.getNombre());
			c.setApellido(user.getApellido());
			c.setEmail(user.getEmail());
			c.setPassword(user.getPassword());
			c.setPuntosAcumulados(50);
			users.add(c);
			return c;
		}
		return null;
	}
	
	private static List<User> loadUsers(){
		List<User> users = new ArrayList<User>();
		users.add(new Dueno(Long.valueOf(counter.incrementAndGet()).intValue(), "Carlos", "Lopez", "dueno@gmail.com", "1234", null));
		users.add(new Cliente(Long.valueOf(counter.incrementAndGet()).intValue(), "Pablo", "Garcia","cliente@gmail.com", "1234", null));
		return users;
	}
}