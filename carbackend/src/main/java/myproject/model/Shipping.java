package myproject.model;




import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Shipping")
public class Shipping implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="efg")
	@SequenceGenerator(name="efg",sequenceName="shipping_sequence")
	private int ShippingAddressId;
	public int getShippingAddressId() {
		return ShippingAddressId;
	}
	public void setShippingAddressId(int shippingAddressId) {
		ShippingAddressId = shippingAddressId;
	}
	
	private String streetName;
	private String apartNo;
	private String city;
	private String state;
	private String country;
	private long zipcode;
	

	@OneToOne
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getApartNo() {
		return apartNo;
	}
	public void setApartNo(String apartNo) {
		this.apartNo = apartNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
}
