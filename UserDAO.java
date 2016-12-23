package com.niit.DAO;

import java.util.List;

import com.niit.model.User;
public interface UserDAO {

public void addUser(User u);
	public void updateUser(User u );
public User getuserById(int id);
	public void removeUser(int id);
 public List<User> listUser();
}