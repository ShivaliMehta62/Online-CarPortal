package myproject.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import myproject.dao.BillingDao;
import myproject.model.Billing;
import myproject.model.Brand;

public class BillingDaoimpl implements BillingDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean saveAddress(Billing bl) {
		Session s1= sessionFactory.getCurrentSession();
		Billing b1 =(Billing)s1.load(Billing.class, billingAddressId);
		s1.save(bl);
		return true;
	}

	public List<Billing> getAllBillAdd() {
		Session s=sessionFactory.getCurrentSession();
		Query q= s.createQuery("from Billing");
		List<Billing> l= q.list();
		return l;
	}

	public Billing getBillAddByID(String BillAdd) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
