package myproject.Controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myproject.Dao.UserDao;
import myproject.model.EmailService;
import myproject.model.User;

@Controller
public class UserController {

	@Autowired
	UserDao userDao;
	User u=new User();
	
	@Autowired
	EmailService emailService;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	
	public String addUser(@ModelAttribute("user")User c,Principal p)
	{
		//User user=new User();
		//user.setUserID(user.getUserID());
		//user.setBilling(user.getBilling());
		//user.setShipping(user.getShipping());
	   if(userDao.save(c))
	   {
		emailService.approvedUserMessage(c);
		///emailService.approvedOrder(c, null, null);
	   }
		
	return 	"Cart";
	}
	
	
/*	 @RequestMapping(value="/updateUser/{userid}")
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
*/
}
	
	


