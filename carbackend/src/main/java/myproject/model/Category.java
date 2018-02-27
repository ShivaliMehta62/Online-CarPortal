	package myproject.model;

	import java.io.Serializable;
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
	public class Category implements Serializable {
	
	@Id
	private String catId;
	private String catName;
	private String catDesc;
   	private String brnds;
	
   	@ManyToOne
	@JoinColumn(name="brnds" , insertable=false, nullable=false, updatable=false)
	
			private Brand brand; 
	
	@OneToMany(mappedBy="category" ,fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Product> Allproduct=new HashSet<Product>();

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	public String getBrnds() {
		return brnds;
	}

	public void setBrnds(String brnds) {
		this.brnds = brnds;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Set<Product> getAllproduct() {
		return Allproduct;
	}

	public void setAllproduct(Set<Product> allproduct) {
		Allproduct = allproduct;
	}

	
	
	
	}