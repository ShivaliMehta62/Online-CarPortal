package myproject.Dao;

import java.util.List;

import myproject.model.Brand;
import myproject.model.Product;

public interface ProductDao {

	
	boolean addProduct(Product p);
	boolean deleteProduct(int proRn);
	boolean updateProduct(Product p);
	public Brand showbrandcard1(int proRn);
	List<Product> getAllProduct();
	Product getProductById(int proRn);
	List<Product> getProductByBrandId(String brandId);
	List<Brand> getBrandByCategoryID(String catId);
	
}
