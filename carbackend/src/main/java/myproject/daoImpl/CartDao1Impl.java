/*package myproject.DaoImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import myproject.Dao.CartDao1;
import myproject.model.Cart;
import myproject.model.Category;

@Repository("cartDao1")
@Transactional
public class CartDao1Impl implements CartDao1 {
	
	
	@Autowired
	SessionFactory sessionFactory;

	public List<Cart> getCartList(String username) {
		 Session s=sessionFactory.getCurrentSession();
			Query q= s.createQuery(" from Cart");
			List<Cart> l= q.list();
			return l;
	}

	public boolean add(Cart cart) {
		Session s1= sessionFactory.getCurrentSession();
		s1.save(cart);
		return true;
	}

	public boolean delete(int id) {
		Session s1= sessionFactory.getCurrentSession();
		s1.delete(id);
		return true;
	}

	public boolean update(Cart cart) {
		Session s1=sessionFactory.getCurrentSession();
		s1.update(cart);
		return false;
	}

	public Cart getCartByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cart getAllCarts() {
		// TODO Auto-generated method stub
		return null;
	}

}
*/