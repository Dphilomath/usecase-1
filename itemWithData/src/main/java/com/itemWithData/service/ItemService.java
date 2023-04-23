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
