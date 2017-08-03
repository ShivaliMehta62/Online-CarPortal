package myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import myproject.dao.CategoryDao;
import myproject.dao.ProductDao;
import myproject.model.Category;
import myproject.model.Product;

	@Controller
	public class HomeController {
          @Autowired
          CategoryDao categoryDao;
          @Autowired
          ProductDao productDao;
		@RequestMapping("/")
		public String home()
		{
			
			return "index";
		}
		

		@RequestMapping("/category")
		public String category(Model model)
		{
			model.addAttribute("categoryList",categoryDao.getAllCategory());
			model.addAttribute("category",new Category());
			return "category";
			
		}
		
		@RequestMapping("/product")
		public String product(Model model)
		{
			model.addAttribute("productList",productDao.getAllProduct());
			model.addAttribute("product",new Product());
			return "product";
			
		}
		
		@RequestMapping("/register")
		public String Register(Model model)
		{
			model.addAttribute("userList",categoryDao.getAllCategory());
			model.addAttribute("user",new Category());
			return "register";
			
		}

		}
		
	
