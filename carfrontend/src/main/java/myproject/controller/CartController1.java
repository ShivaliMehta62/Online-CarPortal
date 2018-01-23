/*package myproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myproject.Dao.CartDao1;
import myproject.model.Cart;


@Controller
public class CartController1 {

	@Autowired
	CartDao1 cartDao1;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	
	 public String AddCart(@ModelAttribute("cart") Cart c)
	 {
		if(c.getId()==0)
		{
		cartDao1.add(c);
		}
		else
		{
			cartDao1.update(c);
		}
		return "redirect:/Cart";
	
	
	 }
	
	@RequestMapping(value="/delete")
	
	public String DeleteCart(@PathVariable("cart") int id, Model model)
	{
	
		model.addAttribute("cart",cartDao1.getCartByID(id));
  		cartDao1.delete(id);
   		model.addAttribute("cartList",cartDao1.getAllCarts());
   		return "Cart";

		
		
	}
	
	
	@RequestMapping(value="/update")
	
	public String UpdateCart(@PathVariable("cart")Cart cart, Model model,int id)
	{
		
		model.addAttribute("cart",cartDao1.getCartByID(id));
		model.addAttribute("cartList",cartDao1.getAllCarts());
		
		return "Cart";
		
	}
	
}
*/