	package myproject.model;

	import java.util.HashSet;
	import java.util.Set;

	import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
	import javax.persistence.Table;

	import org.springframework.stereotype.Component;

	@Entity
	@Component
	@Table(name="Category")
	public class Category {

	public void setCatId(String catId) {
			this.catId = catId;
		}
	
	public String getBrnds() {
		return brnds;
	}
	public void setBrnds(String brnds) {
		this.brnds = brnds;
	}

	@Id
	private String catId;
	private String catName;
	private String catType;
    private String brnds;
	@ManyToOne
	@JoinColumn(name="brnds" , insertable=false, nullable=false, updatable=false)
	
			private Brand brand; 
	
	@OneToMany(mappedBy="category" ,fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Product> w=new HashSet<Product>();
	
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Set<Product> getW() {
		return w;
	}
	public void setW(Set<Product> w) {
		this.w = w;
	}
	public String getCatId() {
		return catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getCatType() {
		return catType;
	}
	public void setCatType(String catType) {
		this.catType = catType;
	}
	}