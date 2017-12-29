package myproject.Dao;

import java.util.List;

import myproject.model.Category;




public interface CategoryDao {


	public boolean addCategory(Category c);
	public boolean deleteCategory(String catid);
	public boolean updateCategory(Category c);
	public List<Category> getAllCategory();
	public Category getCategoryById(String catid);
	
	
	
}
