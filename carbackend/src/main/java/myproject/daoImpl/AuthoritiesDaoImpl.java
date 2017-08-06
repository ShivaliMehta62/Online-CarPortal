package myproject.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import myproject.dao.AuthorityDao;
import myproject.model.Authorities;




public class AuthoritiesDaoImpl implements AuthorityDao {
	
	@Autowired
	SessionFactory sessionFactory;
	

	public boolean addAuthority(Authorities a) {

 		Session s=sessionFactory.getCurrentSession();
 		a.setCatId(a.getCatName());
 		s.persist(a);
 		return true;
		
	}

	public boolean updateAuthority(Authorities a) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAuthority(Authorities a) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Authorities> getAllAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	public Authorities getAuhtoritiesById(String authid) {
		// TODO Auto-generated method stub
		return null;
	}

}
