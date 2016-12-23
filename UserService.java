package com.niit.DAOimpl;

import java.util.List;

import com.niit.model.User;

public interface UserService {

	public void addUser(User u);
	public void updateUser(User u);
	public List<User> listUser();
	public User getuserById(int id);
	public void removeUser(int id);
	
}