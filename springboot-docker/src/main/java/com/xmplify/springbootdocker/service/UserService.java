package com.xmplify.springbootdocker.service;

import java.util.List;

import com.xmplify.springbootdocker.entity.User;

public interface UserService {
	public User getUserById(int id);
	public List<User> getAllUsers();
	public User createUser(User user);
}
