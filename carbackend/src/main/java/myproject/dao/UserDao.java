package myproject.dao;

import java.util.List;


import myproject.model.User;

public interface UserDao {

	public boolean addUser(User u);
	public boolean deleteUser(String userid);
	public boolean saveUser(User u);
	List<User> getAllUser();
	User getUserById(String userid);
}
