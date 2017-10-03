package myproject.Dao;


import java.util.List;

import myproject.model.Brand;

public interface BrandDao {

	public boolean Brandadd(Brand b);
	public boolean deleteBrand(int brandId);
	public boolean updateBrand(Brand b);
	List<Brand> getAllBrands();
	Brand getBrandByID(int brandId);
	List<Brand> getBrandByCategoryID(int catId);
}
