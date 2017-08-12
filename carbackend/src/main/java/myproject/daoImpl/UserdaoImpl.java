package myproject.daoImpl;

import java.util.List;

import myproject.model.Shipping;
import myproject.dao.UserDao;
import myproject.model.Authorities;
import myproject.model.Billing;
import myproject.model.Category;
import myproject.model.User;


	

	import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.Transactional;

	
	@Repository("userDao")
	@Transactional
	public class UserdaoImpl implements UserDao {
		
		@Autowired 
	    SessionFactory sessionFactory;

		public boolean addUser(User u) {
			Session ss=	sessionFactory.getCurrentSession();
			Billing bill=u.getBill();
			Shipping ship=u.getShip();
			u.setUserID(u.getUserName());
			Authorities auth=new Authorities();
			auth.setUsername(u.getUserID());
			auth.setAuthority("ROLE_USER");
			u.setActive(true);
			
				ss.persist(auth);
				ss.persist(u);
				ss.persist(ship);
				ss.persist(bill);
				
				
			
			return true;


	}
		public List<User> getUser() {
			Session ss=sessionFactory.getCurrentSession();
			@SuppressWarnings("rawtypes")
			Query qu=ss.createQuery("from User");
			@SuppressWarnings("unchecked")
			List<User> listUser=(List<User>)qu.list();
			return listUser;

		}
		
		
			
		
	public User getUserById(int id)
	{
			
			
			try {
				return (User) sessionFactory.getCurrentSession().get(User.class, id);
			    }
			catch (HibernateException e)
			{
				e.printStackTrace();
				throw e;
			}
		}
	
	public boolean updateUser(User u) {
		sessionFactory.getCurrentSession().update(u);
		
		return true;
	}
	public boolean deleteUser(String userid) {
		Session ss=sessionFactory.getCurrentSession();
		User u =(User)ss.load(User.class, userid);
		ss.delete(u);
	return true;	
	}
	public boolean updateUser(String userid) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean deleteUser(User u) {
		// TODO Auto-generated method stub
		return false;
	}
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}
	public User getUserById(String userid) {
		// TODO Auto-generated method stub
		return null;
	}
	

	}


