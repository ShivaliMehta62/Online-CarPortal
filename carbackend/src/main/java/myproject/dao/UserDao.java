package myproject.Dao;



import java.util.List;

import myproject.model.User;

public interface UserDao {

	
	//public boolean addUser(User u);
	//public boolean updateUser(User u);
	//public boolean deleteUser(int userID);
	//List<User> getAllUser();
	User getUserById(String loggedInUsername);
	
	public boolean save(User u);
	//public User userById(int id);
	public User usersById(int id);
	public User userByuserName(String username);
	public boolean getStatus(int id);
	public int changeStatus(int id);
	//public User UserbyBillingId(int billingId);
	//public User UserbyShippingId(int shippingId);
	//public boolean update(User u);
	
	
}
