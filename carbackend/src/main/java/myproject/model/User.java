package myproject.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Component;

@Component
@Entity
public class User implements Serializable{
	
	 private static final long  serialVersionUID=1L;

	@Id
	private String userID;
	@Column(unique=true,nullable=false)
	private String userName;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private String userEmail;
	private String userPassword;
	private boolean Active;
	
		
	@OneToOne(mappedBy="user" ,fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Cart cart;

	
	@OneToOne
	@JoinColumn(name="billingId")
	 private Billing billing;
	
	
	@OneToOne
	@JoinColumn(name="shippingId")
	 private Shipping shipping;
	
	
	
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public boolean isActive() {
		return Active;
	}

	public void setActive(boolean active) {
		Active = active;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}

	
	
	
	
	

}

	
	
	

