package myproject.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class UserOrder  implements Serializable {

	
	//private static final long serialVersionUID = -6817737978600394223L;

	@Id

	private String userorderId;

	
	@OneToOne
	@JoinColumn(name="cart")
	private Cart cart;
	
	@OneToOne
	@JoinColumn(name = "userId")
	private User user;

	@OneToOne
	@JoinColumn(name = "billingAddressId")
	private Billing bill;

	@OneToOne
	@JoinColumn(name = "shippingAddressId")
	private Shipping ship;
	
	@Column(name="userorder_id")
	private String orderStatus;



	public String getUserorderId() {
		return userorderId;
	}

	public void setUserorderId(String userorderId) {
		this.userorderId = userorderId;
	}

	
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}


	

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Billing getBill() {
		return bill;
	}

	public void setBill(Billing bill) {
		this.bill = bill;
	}

	public Shipping getShip() {
		return ship;
	}

	public void setShip(Shipping ship) {
		this.ship = ship;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/*public static long getSerialversionuid() {
		return serialVersionUID;
	}
*/

}