package myproject.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Category")
public class Category {

@Id
private String catId;
private String catName;
private String catAddress;
private int catPhone;
private String catType;
private String catEmail;
 
public String getCatEmail() {
	return catEmail;
}
public void setCatEmail(String catEmail) {
	this.catEmail = catEmail;
}


public String getCatAddress() {
	return catAddress;
}
public void setCatAddress(String catAddress) {
	this.catAddress = catAddress;
}
public int getCatPhone() {
	return catPhone;
}
public void setCatPhone(int catPhone) {
	this.catPhone = catPhone;
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