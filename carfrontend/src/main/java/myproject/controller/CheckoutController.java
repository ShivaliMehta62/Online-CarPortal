package myproject.Controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import myproject.Dao.UserDao;
import myproject.Dao.UserOrderDao;
import myproject.model.User;


@Controller
public class CheckoutController {
	private final Logger logger = LoggerFactory.getLogger(CheckoutController.class);

	@Autowired
	private User user;

	@Autowired
	private UserDao userDao;

	@Autowired
	private UserOrderDao userorderDao;

	@Autowired
	private HttpSession session;

	@RequestMapping("/order")
	public String createOrder() {
		// CustomerOrder customerOrder = new CustomerOrder();
		System.out.println("Starting createOrder method in CheckoutControlle");
		logger.info("Starting createOrder method in CheckoutController");
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		String loggedInUsername = username;
		System.out.println(loggedInUsername);
		User user = userDao.userByuserName(loggedInUsername);
		// customerOrder.setCustomer(customer);
		// customerOrder.setBillingAddress(customer.getBillingAddress());
		// customerOrder.setShippingAddress(customer.getShippingAddress());
		System.out.println("///////");
		System.out.println(user.getUserID());
		logger.info("Starting checkout Spring Web Flow...");
		return "redirect:/checkout1?userId=" + user.getUserID();
	}

}


