package myproject.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Brand")
public class Brand {
    
	@Id
	private String brandId;
	private String brandType;
	private String brandName;
	
	@OneToMany(mappedBy="brand" ,fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Category> allCategory=new HashSet<Category>();
	
	@OneToMany(mappedBy="brand" ,fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Product> allProduct=new HashSet<Product>();

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getBrandType() {
		return brandType;
	}

	public void setBrandType(String brandType) {
		this.brandType = brandType;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Set<Category> getAllCategory() {
		return allCategory;
	}

	public void setAllCategory(Set<Category> allCategory) {
		this.allCategory = allCategory;
	}

	public Set<Product> getAllProduct() {
		return allProduct;
	}

	public void setAllProduct(Set<Product> allProduct) {
		this.allProduct = allProduct;
	}
	
	
	
			
}