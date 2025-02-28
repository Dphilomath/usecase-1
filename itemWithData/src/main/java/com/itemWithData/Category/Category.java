package com.itemWithData.Category;
import java.util.List;

import com.itemWithData.Item.Item;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Category {
	@Id
	private Integer categoryID;
	private String categoryName;
	private String categoryDescription;
	@OneToMany(mappedBy = "category")
	private List<Item> items;
public Category() {
	// TODO Auto-generated constructor stub
}
public Category(Integer categoryID, String categoryName, String categoryDescription, List<Item> items) {
	super();
	this.categoryID = categoryID;
	this.categoryName = categoryName;
	this.categoryDescription = categoryDescription;
	this.items = items;
}
public Integer getCategoryID() {
	return categoryID;
}
public void setCategoryID(Integer categoryID) {
	this.categoryID = categoryID;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getCategoryDescription() {
	return categoryDescription;
}
public void setCategoryDescription(String categoryDescription) {
	this.categoryDescription = categoryDescription;
}
public List<Item> getItems() {
	return items;
}
public void setItems(List<Item> items) {
	this.items = items;
}


}