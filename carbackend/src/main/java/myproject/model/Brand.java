package myproject.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Brand")
public class Brand {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int brandId;
	private String brandType;
	private String brandName;
	private String catrn;
	@ManyToOne
	@JoinColumn(name="catrn" , insertable=false, nullable=false, updatable=false)
	
			private Category category;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getCatrn() {
		return catrn;
	}
	public void setCatrn(String catrn) {
		this.catrn = catrn;
	}
	@OneToMany(mappedBy="brand" ,fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	private Set<Product> w=new HashSet<Product>();
	public Set<Product> getW() {
		return w;
	}
	public void setW(Set<Product> w) {
		this.w = w;
	}
	
	public int getBrandId() {
		return brandId;
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
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	
}
