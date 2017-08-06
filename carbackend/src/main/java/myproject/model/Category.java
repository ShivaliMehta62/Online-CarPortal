package myproject.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Category")
public class Category {

@Id
private String catId;
private String catName;

private String catType;

 
@OneToMany(mappedBy="category" ,fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
private Set<Brand> p=new HashSet<Brand>();
public Set<Brand> getP() {
	return p;
}
public void setP(Set<Brand> p) {
	this.p = p;
}



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
public String getCatType() {
	return catType;
}
public void setCatType(String catType) {
	this.catType = catType;
}
}