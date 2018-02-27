package myproject.Dao;

import java.util.List;

import myproject.model.UserOrder;

public interface UserOrderDao {

	public boolean addCustomerOrder(UserOrder userOrder);
	public List<UserOrder> getAllOrders();
	public UserOrder getUserOrderById(String userorderId);
	public int changeOrderStatus(String userorderId, String status);

}
