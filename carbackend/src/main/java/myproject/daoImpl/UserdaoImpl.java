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
			Session s1=sessionFactory.getCurrentSession();
			u.setUserID(u.getUserName());
			s1.persist(u);
			return true;
		}

		public boolean deleteUser(String userid) {
			Session s1 =sessionFactory.getCurrentSession();
			Query<User> query=s1.createQuery("delete from User where userID= "+u.getUserById());    
			query.executeUpdate();  
			return true;
		}


		public boolean updateUser(User u) {
		Session s1 =sessionFactory.getCurrentSession();
		String hql = "update User set userName ='"+u.getUserName()+"',userPass='"+u.getUserPass()+"'+userEmail='"+u.getUserEmail()+"' where userID='"+u.getUserById();
		Query<User> q = s1.createQuery(hql);
		int a=q.executeUpdate();
		System.out.println("Deleted: " +a+ " user(s)");
			return true;
		}

		public List<User> getAllUser() {
			
			Session s=sessionFactory.getCurrentSession();
			Query query=s.createQuery("from User");
			List<User> list=query.getResultList(); 
			return list;
		}


		public User getUserById(String userid) {
			Session s1 =sessionFactory.getCurrentSession();
			Query<User> q = s1.createQuery("from User where userID=?");
		User	user = (User)q.getSingleResult();
		return user;
		}

	

		
		

	}


