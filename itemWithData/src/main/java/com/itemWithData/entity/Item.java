<<<<<<< HEAD:itemWithData/src/main/java/com/itemWithData/entity/Item.java
package com.itemWithData.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
	@Id
	private String itemID;
	private String itemName;
	private String itemStatus;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(String itemID, String itemName, String itemStatus) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemStatus = itemStatus;
	}
	public String getitemID() {
		return itemID;
	}
	public void setitemID(String itemID) {
		this.itemID = itemID;
	}
	public String getitemName() {
		return itemName;
	}
	public void setitemName(String itemName) {
		this.itemName = itemName;
	}
	public String getitemStatus() {
		return itemStatus;
	}
	public void setitemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	
}
=======
package com.itemWithData.Item;
import com.itemWithData.Category.Category;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table


public class Item {
	@Id
	@Column(name = "itemID")
	private String itemID;
	private String itemName;
	private String itemStatus;
	@ManyToOne(cascade = CascadeType.ALL)
	private Category category;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(String itemID, String itemName, String itemStatus, Category category) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemStatus = itemStatus;
		this.category = category;
	}
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemStatus() {
		return itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
}
>>>>>>> a8d8ffbd7c71705f4d47485c740abb45f6d163b4:itemWithData/src/main/java/com/itemWithData/Item/Item.java
