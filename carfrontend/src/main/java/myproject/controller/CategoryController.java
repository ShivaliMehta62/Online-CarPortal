package myproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myproject.Dao.CategoryDao;
import myproject.model.Category;

@Controller
public class CategoryController 
{

	
	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping(value="/addCategory",method=RequestMethod.POST )
	
	public String addcategory(@ModelAttribute("category")Category c)
	{
		if(c.getCatId()==0)
		{
		categoryDao.addCategory(c);
		}
		else
		{
			categoryDao.updateCategory(c);
		}
		return "redirect:/Brand";
		
	}
	
   @RequestMapping(value="/updateCategory/{catid}")
   public String updatecategory(@PathVariable("catid")int catid,Model model)
	{

		model.addAttribute("category",categoryDao.getCategoryById(catid));
		model.addAttribute("categoryList",categoryDao.getAllCategory());
		return "redirect:/Brand";

		
		}
   
   @RequestMapping(value="/deleteCategory/{catid}")
  	public String deletecategory(@PathVariable("catid")int catid,Model model)
  	{

  		model.addAttribute("category",categoryDao.getCategoryById(catid));
  		categoryDao.deleteCategory(catid);
   		model.addAttribute("categoryList",categoryDao.getAllCategory());
   		return "redirect:/Brand";

  		
  		}

}
