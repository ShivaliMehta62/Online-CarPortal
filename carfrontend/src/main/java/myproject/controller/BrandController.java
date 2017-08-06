package myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myproject.dao.Branddao;
import myproject.dao.CategoryDao;
import myproject.model.Brand;

public class BrandController {

	
	@Autowired
	Branddao brandDao;
	@Autowired
	CategoryDao categoryDao;
	@RequestMapping(value="/addBrand",method=RequestMethod.POST)
	
	public String addBrand(@ModelAttribute("brand")Brand b)
	{
		if(b.getBrandId()==null||b.getBrandId().isEmpty())
		{
			brandDao.addBrand(b);
		}
		else
		{
			brandDao.updateBrand(b);
		}
		return "redirect:/Brand";
		
		
	}
@RequestMapping(value="/updateBrand/{brandID}")
	
	public String updateBrand(@PathVariable("brandId")String brID,Model model)
	{
	    model.addAttribute("brand",brandDao.getBrandByID(brID));
	    model.addAttribute("categoryList",categoryDao.getAllCategory());
		model.addAttribute("brandList", brandDao.getAllBrands());
		return "Brand";
	}
@RequestMapping(value="/deleteBrand/{brandID}")

public String deleteProduct(@PathVariable("brandID")String brID,Model model)
{
    
	model.addAttribute("brand",brandDao.getBrandByID(brID));
	brandDao.deleteBrand(brID);
	
	model.addAttribute("brandList",brandDao.getAllBrands());
	return "Brand";
}
	
}
