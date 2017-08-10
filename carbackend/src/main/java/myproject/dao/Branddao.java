package myproject.dao;

import java.util.List;

import myproject.model.Brand;

public interface Branddao {

	public boolean Brandadd(Brand b);
	public boolean deleteBrand(String brandID);
	public boolean updateBrand(Brand b);
	List<Brand> getAllBrands();
	Brand getBrandByID(String brandID);
	//public void Brandadd(Brand b);
}
