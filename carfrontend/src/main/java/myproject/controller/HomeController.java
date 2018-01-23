package myproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import myproject.Dao.BrandDao;
//import myproject.Dao.CartDao1;
import myproject.Dao.CategoryDao;
import myproject.Dao.ProductDao;
import myproject.Dao.UserDao;
import myproject.model.Billing;
import myproject.model.Brand;
import myproject.model.Category;
import myproject.model.Product;
import myproject.model.Shipping;
import myproject.model.User;

	@Controller
	public class HomeController {
        
		@Autowired
          CategoryDao categoryDao;
          @Autowired
          ProductDao productDao;
          @Autowired
          BrandDao brandDao;
          @Autowired
          UserDao userDao;
          
         
          
          
          
		@RequestMapping("/")
		public String home(Model model)
		{
			model.addAttribute("brandList",brandDao.getAllBrands());
						return "index";
		}
		

		@RequestMapping("/Category")
		public String category(Model model)
		{
			model.addAttribute("categoryList",categoryDao.getAllCategory());
			model.addAttribute("brandList",brandDao.getAllBrands());
			model.addAttribute("category",new Category());
			return "Category";
			
		}
		
		
		
		@RequestMapping("/Product")
		public String product(Model model)
		{
			model.addAttribute("productList",productDao.getAllProduct());
			model.addAttribute("brandList",brandDao.getAllBrands());
			model.addAttribute("categoryList",categoryDao.getAllCategory());
			model.addAttribute("product",new Product());
			return "Product";
			
		}
		@RequestMapping("/Brand")
		public String brand(Model model)
		{
			model.addAttribute("brandList",brandDao.getAllBrands());
			//model.addAttribute("categoryList",categoryDao.getAllCategory());
			model.addAttribute("brand",new Brand());
			return"Brand";
			
		}
		
		@RequestMapping("/Register")
		public String Register(Model model)
		{
			Shipping ship = new Shipping();
			Billing bill = new Billing();
			User user=new User();
			user.setShip(ship);
			user.setBill(bill);
			
			model.addAttribute("categoryList",categoryDao.getAllCategory());
			model.addAttribute("brandList",brandDao.getAllBrands());	 
			model.addAttribute("user",new User());
			return "Register";
			
		}
		@RequestMapping("/login")
		public String Login(Model model)
		{
			model.addAttribute("categoryList",categoryDao.getAllCategory());
			model.addAttribute("brandList",brandDao.getAllBrands());
			return "login";
		}
		
		@RequestMapping("/Logout")
		public String Logout(Model model)
		{
			return "login";
		}
		
		
		@RequestMapping("/showbrandcard/{brandId}")
		public String BrandCard(@PathVariable("brandId") String brandId,Model model)
		{
		System.out.println("is going to retrieve brands corresponding to catType");
		//model.addAttribute("categoryList",categoryDao.getAllCategory());
		model.addAttribute("productList",productDao.getProductByBrandId(brandId));
		

			return "Productcard";
		}
		
		
		/*@RequestMapping("/add/{id}")
		public String Cart(@PathVariable("id") Model model,int id)
		{
			model.addAttribute("productList",productDao.getAllProduct());
			model.addAttribute("cartList",cartDao1.getCartByID(id));
			return "Cart";
		}
		*/
		@RequestMapping("/productDetail/{proRn}")
		public String ProductDetail(@PathVariable("proRn")Integer pro,Model model)
		{
			model.addAttribute("brand",brandDao.getAllBrands());
			model.addAttribute("categoryList",categoryDao.getAllCategory());
			model.addAttribute("productList",productDao.getProductById(pro));
			model.addAttribute("pro",productDao.getAllProduct());
			return "ProductDetails";
		}
	
		//@RequestMapping("/ProductCard/{proRn}")
		//public String product(@PathVariable("proRn")Integer pro,Model model1)
		//{
			//model1.addAttribute("brandList",brandDao.getAllBrands());
			//model1.addAttribute("productList",productDao.getAllProduct());
			//model1.addAttribute("productList1",productDao.getProductById(pro));
			//return "ProductCard";
		//}
		
		@RequestMapping("/adminHome")
		
		public String AdminCard(Model model)
		{
		model.addAttribute("categoryList",categoryDao.getAllCategory());
		model.addAttribute("brandList",brandDao.getAllBrands());
		return "adminhome";
		}		
	}
		
		
		

		
		
	
