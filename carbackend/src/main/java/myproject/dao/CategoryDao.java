package myproject.dao;

import java.util.List;

import myproject.model.Category;


public interface CategoryDao {

	
	    
		public boolean addCategory(Category c);
		public boolean deleteCategory(String catid);
		public boolean updateCategory(Category c);
		List<Category> getAllCategory();
		Category getCategoryById(String catid);
}
