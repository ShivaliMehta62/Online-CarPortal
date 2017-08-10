package myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myproject.dao.UserDao;
import myproject.model.Billing;
import myproject.model.User;

@Controller
public class UserController {

	@Autowired
	UserDao userDao;
	User u=new User();
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	
	public String addUser(@ModelAttribute("user")User c)
	{
		Billing bill;
		Shipping ship;
	
		if(c.getUserID()==null||c.getUserID().isEmpty())
		{
		userDao.addUser(c);
		}
		else 
		{
			userDao.updateUser(c);
		}
	
		return "index";
	}
	 @RequestMapping(value="/updateUser/{userid}")
	   public String updateuser(@PathVariable("userid")String userid,Model model)
		{

			model.addAttribute("user",userDao.getUserById(userid));
			model.addAttribute("userList",userDao.getAllUser());
			return "Register";

			
			}
	   
	   @RequestMapping(value="/deleteUser/{userid}")
	  	public String deleteuser(@PathVariable("userid")String userid,Model model)
	  	{

	  		model.addAttribute("user",userDao.getUserById(userid));
	  		userDao.deleteUser(userid);
	   		model.addAttribute("userList",userDao.getAllUser());
	   		return "redirect:/user";

	  		
	  		}
}


	
	

