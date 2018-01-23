package myproject.Controller;


import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpSession;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//import myproject.Dao.BrandDao;
import myproject.Dao.CartDao;
//import myproject.Dao.CategoryDao;
import myproject.Dao.ProductDao;
import myproject.Dao.UserDao;
//import myproject.Dao.UserDao;
import myproject.model.Cart;
import myproject.model.Product;
import myproject.model.User;
//import myproject.model.User;


@RequestMapping("/Cart")
@Controller
public class CartController {
	
	private final Logger logger = LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	private Cart cart;
	
	
	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping("/all")
	public String getCart(Model model ) {
		
		logger.info("Starting getCart method in CartController");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		String loggedInUsername = username;
		
		session.setAttribute("numberProducts", cartDao.getNumberOfProducts(loggedInUsername));
		session.setAttribute("cartList", cartDao.getCartList(loggedInUsername));
		session.setAttribute("totalAmount", cartDao.getTotalAmount(loggedInUsername));
		/*model.addAttribute("categoryList",categoryDao.getAllCategory());
		model.addAttribute("brandList", brandDao.getAllBrands());
		model.addAttribute("productList",productDao.getAllProduct());
		*/
		return "Cart";
	
	}

	
	@RequestMapping(value = "/addToCart/{id}")

	public String addToCart(@PathVariable("id") int id, Model model ,RedirectAttributes redirect,Principal p,Cart c) {
	
	logger.info("Starting aadtocart method in cartcontroller");
	
	try
	{
		Cart cart = new Cart();
		Product product = productDao.getProductById(id);
		cart.setProductName(product.getCategoryId());
		cart.setPrice(product.getProCost());
		cart.setDateAdded(new Date());
		String loggedInUsername = null;
		if (loggedInUsername == null) 
		{
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String username = auth.getName();
			loggedInUsername = username;
        }
		cart.setUsername(loggedInUsername);
		User user=userDao.userByuserName(loggedInUsername);
		cart.setStatus("NEW");
		cart.setUserid(user.getUserID());
		Cart existCart = cartDao.getCartByUsername(loggedInUsername, cart.getProductName());
		if (existCart != null) 
        {
		    int currentQuantity = cartDao.getQuantity(loggedInUsername, cart.getProductName());
			cart.setId(existCart.getId());
			cart.setQuantity(currentQuantity + 1);
			boolean flag = cartDao.update(cart);
			if (flag) {

				redirect.addFlashAttribute("success", product.getProNm() + " " + "Successfully added to cart!");
				session.setAttribute("numberProducts", cartDao.getNumberOfProducts(loggedInUsername));
				return "redirect:/Cart/all";

			} else {
				redirect.addFlashAttribute("error", "Failed to add product to cart!");
				return "redirect:/ProductCard";
			}
		}
        else 
        {
			cart.setQuantity(1);
			boolean flag = cartDao.save(cart);

			if (flag) {

				redirect.addFlashAttribute("success", product.getProNm() + " " + "Successfully added to cart!");
				session.setAttribute("numberProducts", cartDao.getNumberOfProducts(loggedInUsername));
				return "redirect:/Cart/all";

			} else {
				redirect.addFlashAttribute("error", "Failed to add product to cart!");
				return "redirect:/ProductCard";
			}
		}

	} catch (Exception e) {
		// TODO: handle exception
		logger.error("Exception occured " + e);
		model.addAttribute("catchError", "Server is not responding please try again letter.");
		return "Cart";
		}
			/* Cart cart = new Cart();
			Product product =  productDao.getProductById(id);
			
			cart.setProductName(product.getProNm());
			String s =product.getProCost();
			cart.setPrice(Long.parseLong(s));
			cart.setDateAdded(new Date());
			
		     String username=p.getName();
		    	cart.setUsername(username);
			  cart.setStatus("NEW");
			//User user =userDao.getUserByUserName(username);
			//cart.setUserID(user.getUserID());
			Cart existCart = cartDao.getCartByUsername(username, cart.getProductName());
			if (existCart != null) {
				int currentQuantity = cartDao.getQuantity(username, cart.getProductName());
				cart.setId(existCart.getId());
				cart.setQuantity(currentQuantity + 1);
				boolean flag = cartDao.update(cart);

				if (flag) {

					redirect.addFlashAttribute("success", product.getProNm() + " " + "Successfully added to cart!");
					session.setAttribute("numberProducts", cartDao.getNumberOfProducts(username));
					return "redirect:/myCart/all";

				} else {
					redirect.addFlashAttribute("error", "Failed to add product to cart!");
					return "redirect:/CatProduct";
				}
			} else {
				System.out.println("first time product is going to add");
				cart.setQuantity(1);
				System.out.println(cart.getQuantity());
				boolean flag = cartDao.save(cart);

				if (flag) {

					redirect.addFlashAttribute("success", product.getProNm() + " " + "Successfully added to cart!");
					session.setAttribute("numberProducts", cartDao.getNumberOfProducts(username));
					return "redirect:/myCart/all";

				} else {
					redirect.addFlashAttribute("error", "Failed to add product to cart!");
					return "redirect:/CatProduct";
				}
			}
		
		
		*/
		}
		
		
		
	@RequestMapping("/delete/{id}")
	public String removeCart(@PathVariable("id") int proRn, Model model)
	{
		System.out.println("Cartcontroller delete method"+ proRn);
		model.addAttribute("id",cartDao.getCartById(proRn));
		cartDao.delete(proRn);
		model.addAttribute("cartList",cartDao.getCartById(proRn));
		return "redirect:/Cart/all";
		
				/*ModelAndView mv = new ModelAndView("redirect:/index");
		//System.out.println("black");
		boolean b=this.cartDao.delete(productId);
		if(b)
		{
			   session.setAttribute("total",cartDao);
		}
	    return mv;*/
	}

	
	@RequestMapping("/clearCart")
	public String clearCart(RedirectAttributes redirect, Model model) {
		logger.info("Starting clearCart method in CartController");
		try {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			String username = auth.getName();
			int flag = cartDao.clearCart(username);

			if (flag >= 1) {
				redirect.addFlashAttribute("success", "All Items removed successfully.");
				return "redirect:/Cart/all";
			} else {
				redirect.addFlashAttribute("error", "Failed to clear cart!");
				return "redirect:/Cart/all";
			}

		} catch (Exception e) {

			logger.error("Exception occured " + e);
			model.addAttribute("catchError", "Server is not responding please try again letter.");
			return "redirect:/Cart/all";
		}
	}
}

