package com.niit.DAOimpl;
import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.niit.DAO.UserDAO;
import com.niit.model.User;
@Repository
public  class UserDAOImpl implements UserDAO {
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void addUser(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
		logger.info("user saved successfully, Userdetails="+u);
	}
	@Override
	public void updateUser(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(u);
		logger.info("User updated successfully, Userdetails="+u);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> listUser() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> usersList = (List<User>) session.createQuery("from User");
		for(User u : usersList){
			logger.info("User List::"+u);
		}
		return usersList;
	}

	@Override
	public User getuserById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		User u = (User) session.load(User.class, new Integer(id));
		logger.info("User loaded successfully, Userdetails="+u);
		return u;
	}

	@Override
	public void removeUser(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		User u = (User) session.load(User.class, new Integer(id));
		if(null != u){
			session.delete(u);
		}
		logger.info("user deleted successfully, Userdetails="+u);
	}
		
	}

