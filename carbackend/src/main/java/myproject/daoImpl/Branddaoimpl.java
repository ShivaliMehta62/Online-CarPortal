package myproject.DaoImpl;

import myproject.Dao.BrandDao;
import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import myproject.model.Brand;


@Repository("brandDao")
@Transactional
public class BrandDaoImpl implements BrandDao {

	@Autowired
	SessionFactory sessionFactory;
	
	
	public boolean Brandadd(Brand b) {
		Session s=sessionFactory.getCurrentSession();
 		s.persist(b);
 		return true;
		
		
	}

	public List<Brand> getBrandByCategoryID(int catId) {
		Session s1 =sessionFactory.getCurrentSession();
		@SuppressWarnings("rawtypes")
		Query query=s1.createQuery("from Brand where categoryID=?");
		query.setInteger(0,catId);
		@SuppressWarnings("unchecked")
		List<Brand> listCatBrand=(List<Brand>)query.getResultList();
		return listCatBrand;
	}

	public boolean deleteBrand(int brandId) {
		Session s1= sessionFactory.getCurrentSession();
		Brand b =(Brand)s1.load(Brand.class, brandId);
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
			((Criteria) s).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
			List<Brand> l= q.list();
			
			return l;
		
	}

	

	public Brand getBrandByID(int brandId) {
		Session s=sessionFactory.getCurrentSession();
		Query<Brand> g=s.createQuery(" from Brand where brandId=?");
		g.setParameter(0,brandId);
		Brand mq=(Brand)g.getSingleResult();
		return  mq;	
	}

	public boolean deleteBrand(Brand b) {
		// TODO Auto-generated method stub
		return false;
	}

	

	

	

	

}
