package myproject.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import myproject.dao.ShippingDao;
import myproject.model.Billing;
import myproject.model.Shipping;

public class ShippingDaoImpl implements ShippingDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean saveaddress(Shipping s) {
		Session s1= sessionFactory.getCurrentSession();
		//Billing b1 =(Billing)s1.load(Billing.class, billingAddressId);
		s1.save(s);
		return true;
	}

	public List<Shipping> getAllShipAdd() {
		Session s=sessionFactory.getCurrentSession();
		Query q= s.createQuery("from Shipping");
		List<Shipping> l= q.list();
		return l;
	}

	public Shipping getShipAddByID(String ShipAdd) {
		// TODO Auto-generated method stub
		return null;
	}

}
