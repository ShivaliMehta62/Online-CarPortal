package myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import myproject.dao.Branddao;
import myproject.dao.CategoryDao;
import myproject.dao.ProductDao;
import myproject.dao.UserDao;
import myproject.model.Brand;
import myproject.model.Category;
import myproject.model.Product;
import myproject.model.User;

	@Controller
	public class HomeController {
          @Autowired
          CategoryDao categoryDao;
          @Autowired
          ProductDao productDao;
          @Autowired
          Branddao brandDao;
          @Autowired
          UserDao userDao;
		@RequestMapping("/")
		public String home(Model model)
		{
			model.addAttribute("categoryList",categoryDao.getAllCategory());
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
			model.addAttribute("brandList",brandDao.getAllBrands());
			model.addAttribute("product",new Product());
			return "product";
			
		}
		@RequestMapping("/Brand")
		public String brand(Model model)
		{
			model.addAttribute("brandList",brandDao.getAllBrands());
			model.addAttribute("categoryList",categoryDao.getAllCategory());
			model.addAttribute("brand",new Brand());
			return "Brand";
			
		}
		
		@RequestMapping("/register")
		public String Register(Model model)
		{
						model.addAttribute("user",new User());
			return "register";
			
		}

		}
		
	
