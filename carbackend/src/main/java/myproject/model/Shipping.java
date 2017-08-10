package myproject.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Shipping {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int ShippingAddressId;
	private String streetName;
	private String apartNo;
	private String city;
	private String state;
	private String country;
	private long zipcode;

}
