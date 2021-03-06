package myproject.DaoImpl;


import myproject.Dao.UserOrderDao;
import myproject.model.EmailService;
import myproject.model.Product;
import myproject.model.Shipping;
import myproject.model.User;
import myproject.model.UserOrder;
import java.util.List;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository("userOrderDao")
public class UserOrderDaoImpl implements UserOrderDao{

	//private final Logger logger = LoggerFactory.getLogger(CustomerOrderDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private EmailService emailService;
	
	public boolean addUserOrder(UserOrder userOrder) {
		
			Session session = sessionFactory.getCurrentSession();
			User user= userOrder.getUser();
			Shipping ship=new Shipping();
			Product pro=new Product();
			emailService.approvedOrder(user,ship,pro);
			userOrder.setUserorderId(user.getUserID());
			userOrder.setBill(user.getBilling());
			userOrder.setShip(user.getShipping());
			userOrder.setOrderStatus("Placed");
			session.saveOrUpdate(userOrder);
			session.saveOrUpdate(user);
			session.saveOrUpdate(user.getBilling());
			session.saveOrUpdate(user.getShipping());
			
			return true;
			
		
	}

	public List<UserOrder> getAllOrders() {
		                        
			Session s=sessionFactory.getCurrentSession();
			Query q= s.createQuery(" from UserOrder");
				List<UserOrder> l= q.list();
				return l;
				
	}

	public UserOrder getUserOrderById(int userorderId) {
		
				
					
				Session s=sessionFactory.getCurrentSession();
				Query<UserOrder> g=s.createQuery("from UserOrder where userorderId=?");
				g.setParameter(0,userorderId);
				UserOrder mq=(UserOrder)g.getSingleResult();
				return  mq;
	}

	
	public int changeOrderStatus(int userorderId, String status) {
		
			Query query = sessionFactory.getCurrentSession()
					.createQuery("UPDATE UserOrder SET orderStatus = '" + status + "' where userorderId = " + userorderId);
			return query.executeUpdate();
			
		
}

	public int changeOrderStatus(String userorderId, String status) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}


