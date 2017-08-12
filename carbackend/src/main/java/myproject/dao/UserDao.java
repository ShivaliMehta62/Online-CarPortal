package myproject.dao;

import java.util.List;


import myproject.model.User;

public interface UserDao {

	public boolean addUser(User u);
	public boolean updateUser(User u);
	public boolean deleteUser(String userid);
	List<User> getAllUser();
	User getUserById(String userid);
}
