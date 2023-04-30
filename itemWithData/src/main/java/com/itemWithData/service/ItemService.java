<<<<<<< HEAD:itemWithData/src/main/java/com/itemWithData/service/ItemService.java
package com.itemWithData.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.itemWithData.dao.ItemRepo;
import com.itemWithData.entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ItemService {
	List<Item> items = new ArrayList<>(Arrays.asList(
			new Item("01", "arya", "Active"),
			new Item("02", "Soap", "Online"),
			new Item("03", "Battery", "Inactive")

	));
	@Autowired
	private ItemRepo itemRepo;

	public List<Item> displayAllItems() {
		return items;
	}

	public Item getItem(String itemID) {
		return items.stream().filter(t -> t.getitemID().equals(itemID)).findFirst().get();
	}

	public void newTopic(Item i) {
		items.add(i);

	}
	public void updateItem(Item i, String itemID) {
		int ind=0;
		for(Item j : items) {
			if (j.getitemID().equals(itemID)) {
				items.set(ind, i);
				return;
			}
			ind++;
		}
		
	}
	public void deleteItemById(Item i, String itemID) {
		int ind=0;
		for(Item j : items) {
			if (j.getitemID().equals(itemID)) {
				items.remove(ind);
				return;
			}
			ind++;
		}
		
	}
	
}
=======
package com.itemWithData.Item;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ItemService  {
	@Autowired
	ItemRepository itemrepo;

	public List<Item> displayAllItems(){
//		return items;
		List<Item> temp = new ArrayList<>();
		itemrepo.findAll().forEach(temp::add);
		return temp;
	}
	public Optional<Item> getItem(String itemID) {
//		return items.stream().filter(t->t.getitemID().equals(itemID)).findFirst().get();
		Optional<Item> temp = itemrepo.findById(itemID);
		return temp;
	}
	public void newTopic(Item i) {
//		items.add(i);
		itemrepo.save(i);
	}
	public void updateItem(Item i, String itemID) {
//		int ind=0;
//		for(Item j : items) {
//			if (j.getitemID().equals(itemID)) {
//				items.set(ind, i);
//				return;
//			}
//			ind++;
//		}
		itemrepo.save(i);
		
	}
	public void deleteItemById(Item i, String itemID) {
//		int ind=0;
//		for(Item j : items) {
//			if (j.getitemID().equals(itemID)) {
//				items.remove(ind);
//				return;
//			}
//			ind++;
//		}
		itemrepo.deleteById(itemID);
		
	}
	
}
>>>>>>> a8d8ffbd7c71705f4d47485c740abb45f6d163b4:itemWithData/src/main/java/com/itemWithData/Item/ItemService.java
