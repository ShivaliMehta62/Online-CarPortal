package myproject.daoImpl;

import java.util.List;

import myproject.dao.UserDao;
import myproject.model.User;


	

	import java.util.List;

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
		Session sf=sessionFactory.getCurrentSession();
		u.setUserId(u.getName());
		Authorities auth=new Authorities();
		auth.setName(u.getUserId());
		auth.setRole("ROLE_USER");
		u.setActive(true);


		return false;
	}

	public boolean deleteUser(String userid) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean saveUser(User u) {
		Session session = sessionFactory.getCurrentSession();
         u.getBillingAddress().setUser(u);
		u.getShippingAddress().setUser(u);
		session.persist(u);
			session.persist(u.getBillingAddress());
		session.persist(u.getShippingAddress());
		Author auth = new Author();
			auth.setRole("ROLE_USER");
			auth.setUsername((u.getUsername()));
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


