package myproject.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Component

@Table(name="Billing")

public class Billing {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int billingAddressId;
	private String bstreetName;
	private String bapartNo;
	private String bcity;
	private String bstate;
	private String bcountry;
	private long bzipcode;
	
	@OneToOne
	private User user;

	

	public int getBillingAddressId() {
		return billingAddressId;
	}

	public void setBillingAddressId(int billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public String getBstreetName() {
		return bstreetName;
	}

	public void setBstreetName(String bstreetName) {
		this.bstreetName = bstreetName;
	}

	public String getBapartNo() {
		return bapartNo;
	}

	public void setBapartNo(String bapartNo) {
		this.bapartNo = bapartNo;
	}

	public String getBcity() {
		return bcity;
	}

	public void setBcity(String bcity) {
		this.bcity = bcity;
	}

	public String getBstate() {
		return bstate;
	}

	public void setBstate(String bstate) {
		this.bstate = bstate;
	}

	public String getBcountry() {
		return bcountry;
	}

	public void setBcountry(String bcountry) {
		this.bcountry = bcountry;
	}

	public long getBzipcode() {
		return bzipcode;
	}

	public void setBzipcode(long bzipcode) {
		this.bzipcode = bzipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	

	


	
	
	
}
