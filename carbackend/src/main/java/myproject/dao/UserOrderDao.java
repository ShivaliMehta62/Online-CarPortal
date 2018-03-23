package myproject.Dao;

import java.util.List;

import myproject.model.UserOrder;

public interface UserOrderDao {

	public boolean addUserOrder(UserOrder userOrder);
	public List<UserOrder> getAllOrders();
	public UserOrder getUserOrderById(int userorderId);
	public int changeOrderStatus(String userorderId, String status);
   
}
