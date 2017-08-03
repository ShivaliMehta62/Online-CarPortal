package myproject.dao;

import java.util.List;

import myproject.model.Product;

public interface ProductDao {

	  
			boolean addProduct(Product p);
			boolean deleteProduct(String prorn);
			boolean updateProduct(Product p);
			List<Product> getAllProduct();
			Product getProductById(String productId);
}
