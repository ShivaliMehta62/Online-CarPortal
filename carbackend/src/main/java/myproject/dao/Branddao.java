package myproject.dao;

import java.util.List;

import myproject.model.Brand;

public interface Branddao {

	public boolean addBrand(Brand b);
	public boolean deleteBrand(String brandID);
	public boolean updateBrand(Brand b);
	List<Brand> getAllBrands();
	Brand getBrandByID(String brandID);
}
