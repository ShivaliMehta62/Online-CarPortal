package myproject.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
@Table(name="Product")

public class Product {

	//private static final String DegenarationType = null;
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int proRn;
	public void setProRn(int proRn) {
		this.proRn = proRn;
	}

	@Column(name="Product_name")
	private String proNm;
	private String proCost;
	private String proType;
	private String brandid;
	private String brands;
	
	
	 
	
	
	@ManyToOne
	@JoinColumn(name="brandid", insertable=false, nullable=false, updatable=false)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="brands" , insertable=false, nullable=false, updatable=false)
	private Brand brnds;
	        
	    
	@OneToMany(mappedBy="brand" ,fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Category> p=new HashSet<Category>();
	    	
	    	
	@OneToMany(mappedBy="category" ,fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	    	private Set<Product> w=new HashSet<Product>();
	    	
	    	
 	
	
	
	public String getBrands() {
				return brands;
			}
			public void setBrands(String brands) {
				this.brands = brands;
			}
			
			public Set<Category> getP() {
				return p;
			}
			public void setP(Set<Category> p) {
				this.p = p;
			}
			public Set<Product> getW() {
				return w;
			}
			public void setW(Set<Product> w) {
				this.w = w;
			}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getBrandid() {
		return brandid;
	}
	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}
	
	
	public Brand getBrnds() {
		return brnds;
	}
	public void setBrnds(Brand brnds) {
		this.brnds = brnds;
	}
	public String getProCost() {
		return proCost;
	}
	public void setProCost(String proCost) {
		this.proCost = proCost;
	}
	public String getProType() {
		return proType;
	}
	public void setProType(String proType) {
		this.proType = proType;
	}
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
	@Transient
	MultipartFile image;
	
	public int getProRn() {
		return proRn;
	}
	public String getProNm() {
		return proNm;
	}
	public void setProNm(String proNm) {
		this.proNm = proNm;
	}
	
	
	
	
	}

