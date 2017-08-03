package myproject.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

public class Product implements Serializable {

	//private static final String DegenarationType = null;
	@Id
	private String proRn;
	@Column(name="Product_name")
	private String proNm;
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	private String proDesc;
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
	public String getProDesc() {
		return proDesc;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	
	
	
	}

