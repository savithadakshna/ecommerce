package com.niit.DAOimpl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.UserDAO;
import com.niit.model.User;
@Transactional
@Repository
public  class UserDAOimpl implements UserDAO {
	//private static final Logger logger = LoggerFactory.logger(UserDAOimpl);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
public void addUser(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(u);
		//logger.info("user saved successfully, Userdetails="+u);
		System.out.println("user saved successfully");
	}
	public void updateUser(User u) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(u);
		//logger.info("User updated successfully, Userdetails="+u);
		System.out.println("user updated successfully");
	}
	
	@SuppressWarnings("unchecked")
	public List<User> listUser() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> usersList = (List<User>) session.createQuery("from User");
		for(User u : usersList){
			//logger.info("User List::"+u);
			System.out.println("user List");
		}
		return usersList;
	}

	public User getuserById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();		
		User u = (User) session.load(User.class, new Integer(id));
		//logger.info("User loaded successfully, Userdetails="+u);
		System.out.println("user loaded successfully");
		return u;
		
	}

	public void removeUser(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		User u = (User) session.load(User.class, new Integer(id));
		if(null != u){
			session.delete(u);
		}
		//logger.info("user deleted successfully, Userdetails="+u);
		System.out.println("user deleted successfully");
	}
		
	}

