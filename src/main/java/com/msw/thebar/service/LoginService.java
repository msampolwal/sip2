package com.msw.thebar.service;

import com.msw.thebar.model.User;

public interface LoginService {
	
	public User getUser(User user);
	
	public User createUser(User user);
}