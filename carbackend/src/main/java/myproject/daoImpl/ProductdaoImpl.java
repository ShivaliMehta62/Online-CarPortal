package myproject.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import myproject.Dao.ProductDao;
import myproject.model.Brand;
import myproject.model.Product;


@Repository("productDao")
@Transactional

public class ProductDaoImpl implements ProductDao {

	public List<Product> getProductByCategoryId(int catId) {
		Session s1 =sessionFactory.getCurrentSession();
		@SuppressWarnings("rawtypes")
		Query q = s1.createQuery("from Product where catId=?");
		q.setInteger(0,catId);
		@SuppressWarnings("unchecked")
	    List<Product> pro = (List<Product>)q.getResultList();
	    return pro;
	}

	@Autowired
 	SessionFactory sessionFactory;
	
	public boolean addProduct(Product p) {

 		Session s=sessionFactory.getCurrentSession();
 		s.persist(p);
		return true;
	}

	public boolean deleteProduct(int proRn) {
		Session s=sessionFactory.getCurrentSession();
		Product p =(Product)s.load(Product.class, proRn);
		s.delete(p);
		return true;
	}

	public boolean updateProduct(Product p) {
		Session s=sessionFactory.getCurrentSession();
		//p.setProRn(p.getProNm());
		s.update(p);
		return true;
	}

	public List<Product> getAllProduct() {
		 Session s=sessionFactory.getCurrentSession();
			Query q= s.createQuery("from Product");
			List<Product> l= q.list();
		return l;
	}

	
	public Product getProductById(int proRn) {
		Session s=sessionFactory.getCurrentSession();
		Query<Product> h=s.createQuery("from Product where proRn=?");
		h.setParameter(0,proRn);
		Product p=(Product)h.getSingleResult();
		return  p;
	}

	public List<Brand> getBrandByCategoryID(String catId) {
		Session s1 =sessionFactory.getCurrentSession();
		@SuppressWarnings("rawtypes")
		Query query=s1.createQuery("from Brand where categoryID=?");
		query.setString(0,catId);
		@SuppressWarnings("unchecked")
		List<Brand> listCatBrand=(List<Brand>)query.getResultList();
		return listCatBrand;
		
	}

    public List<Product> getProductByBrandId(String brandId) {
    Session s1= sessionFactory.getCurrentSession();
    Query query = s1. createQuery("from Product where brandId=? ");
    query.setString(0,brandId);
    List<Product> listprod = query.getResultList();
    return listprod;
}
    
    //public Product ProductDetail1(int proRn)
    //{
    	//Session s1=sessionFactory.getCurrentSession();
    	//Query<Product> h=s1.createQuery("from Product where proRn=?");
    	//h.setParameter(0,proRn);
		//Product p=(Product)h.getSingleResult();
		//return p;
    
    
    public Brand showbrandcard1(int proRn)
	{
		 Session s=sessionFactory.getCurrentSession();
		 Query<Brand> g=s.createQuery("from Product where brandId=?");
		g.setParameter(0,proRn);
		Brand mq1=(Brand)g.getSingleResult();
		return  mq1;	
			
	}

	
    
    
    
}
	



	
	

