package com.niit.DAOimpl;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.UserDAO;
import com.niit.model.User;
@Service
public class UserServiceImpl implements UserService{
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Transactional
	public void addUser(User u) {
		this.userDAO.addUser(u);
	}
	@Transactional
	public void updateUser(User u) {
		this.userDAO.updateUser(u);
	}

	@Transactional
	public List<User> listUser() {
		return this.userDAO.listUser();
	}
	@Transactional
	public User getuserById(int id) {
		return this.userDAO.getuserById(id);
	}
	@Transactional
	public void removeUser(int id) {
		this.userDAO.removeUser(id);
	}



}
