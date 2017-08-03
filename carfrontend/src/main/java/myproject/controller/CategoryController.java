package myproject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myproject.dao.CategoryDao;
import myproject.model.Category;

@Controller
public class CategoryController 
{

	
	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping(value="/addCategory",method=RequestMethod.POST )
	
	public String addcategory(@ModelAttribute("category")Category c,Model model)
	{
		if(c.getCatId()==null||c.getCatId().isEmpty())
		{
		categoryDao.addCategory(c);
		}
		else
		{
			categoryDao.updateCategory(c);
		}
		return "redirect:/category";
		
	}
	
   @RequestMapping(value="/updateCategory/{catid}")
   public String updatecategory(@PathVariable("catid")String catid,Model model)
	{

		model.addAttribute("category",categoryDao.getCategoryById(catid));
		model.addAttribute("categoryList",categoryDao.getAllCategory());
		return "category";

		
		}
   
   @RequestMapping(value="/deleteCategory/{catid}")
  	public String deletecategory(@PathVariable("catid")String catid,Model model)
  	{

  		model.addAttribute("category",categoryDao.getCategoryById(catid));
  		categoryDao.deleteCategory(catid);
   		model.addAttribute("categoryList",categoryDao.getAllCategory());
   		return "redirect:/category";

  		
  		}

}
