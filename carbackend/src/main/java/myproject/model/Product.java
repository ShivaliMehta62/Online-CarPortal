package myproject.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int proRn;
	public void setProRn(int proRn) {
		this.proRn = proRn;
	}

	@Column(name="Product_name")
	private String proNm;
	private String proCost;
	private String proType;
	private String categoryId; // this is for category
	private String brandId; //<!-- this is for brand-->
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="categoryId", insertable=false, nullable=false, updatable=false)
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="brandId" , insertable=false, nullable=false, updatable=false)
	private Brand brand;
	        	    	
	@Transient
	MultipartFile image;
	public String getProNm() {
		return proNm;
	}

	public void setProNm(String proNm) {
		this.proNm = proNm;
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

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public int getProRn() {
		return proRn;
	}
	
	
	
	}

