package myproject.daoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myproject.dao.Branddao;
import myproject.model.Brand;
import myproject.model.Category;

@Repository("brandDao")
@Transactional


public class Branddaoimpl implements Branddao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public boolean Brandadd(Brand b) {
		Session s=sessionFactory.getCurrentSession();
 		b.setBrandId(b.getBrandName());
 		s.persist(b);
 		return true;
		
		
	}

	public boolean deleteBrand(String brandID) {
		Session s1= sessionFactory.getCurrentSession();
		Brand b =(Brand)s1.load(Brand.class, brandID);
		s1.delete(b);
		return true;
	}

	public boolean updateBrand(Brand b) {
		Session s1= sessionFactory.getCurrentSession();
		//Brand b =(Brand)s1.load(Brand.class, brandID);
		s1.update(b);
		return true;
	}

	public List<Brand> getAllBrands() {
		 Session s=sessionFactory.getCurrentSession();
			Query q= s.createQuery("from Brand");
			List<Brand> l= q.list();
			
			return l;
		
	}

	

	public Brand getBrandByID(String brandID) {
		Session s=sessionFactory.getCurrentSession();
		Query<Brand> g=s.createQuery("from Brand where brandId=?");
		g.setParameter(0,brandID);
		Brand mq=(Brand)g.getSingleResult();
		return  mq;	
	}

	

	

}
