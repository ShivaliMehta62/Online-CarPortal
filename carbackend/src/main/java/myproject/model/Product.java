package myproject.model;




import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	private String proRn;
	@Column(name="Product_name")
	private String proNm;
	private String proCost;
	private String proType;
	private String brandid;
	@ManyToOne
	@JoinColumn(name="brandid" , insertable=false, nullable=false, updatable=false)
	
			private Brand brand;
	
	public String getBrandid() {
		return brandid;
	}
	public void setBrandid(String brandid) {
		this.brandid = brandid;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
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
	public String getProRn() {
		return proRn;
	}
	public void setProRn(String proRn) {
		this.proRn = proRn;
	}
	public String getProNm() {
		return proNm;
	}
	public void setProNm(String proNm) {
		this.proNm = proNm;
	}
	
	
	
	
	}

