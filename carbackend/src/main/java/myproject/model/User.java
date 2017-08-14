package myproject.model;






import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;



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
	@Column(unique=true)
	private String userName;
	private String userEmail;
	private String userPassword;
	private boolean Active;
	
	@OneToOne
	@JoinColumn(name="billingAddressId")
	 private Billing bill;
	
	public Billing getBill() {
		return bill;
	}
	public void setBill(Billing bill) {
		this.bill = bill;
	}
	
	public String getUserID() {
		return userID;
	}
	@OneToOne
	@JoinColumn(name="ShippingAddressId")
	private Shipping ship;
	public Shipping getShip() {
		return ship;
	}
	public void setShip(Shipping ship) {
		this.ship = ship;
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
	
	
	
	

}

	
	
	

