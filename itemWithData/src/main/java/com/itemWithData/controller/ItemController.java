package com.itemWithData.controller;

import java.util.List;

import com.itemWithData.dao.ItemRepo;
import com.itemWithData.entity.Item;
import com.itemWithData.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemController {
	@Autowired
	ItemRepo itemRepo;
	@Autowired
	private ItemService itemService;

	@RequestMapping("/items")
	public List<Item> returnAllItems() {

		return itemService.displayAllItems();

	}

	@RequestMapping("/items/{itemID}")
	public Item getItemByID(@PathVariable String itemID) {
		return itemService.getItem(itemID);
	}
	@RequestMapping(method = RequestMethod.POST,value="/items")
	public void addItem(@RequestBody Item i) {
		itemService.newTopic(i);
	}
	@RequestMapping(method = RequestMethod.PUT,value="/items/{itemID}")
	public void updateItem(@RequestBody Item i,@PathVariable String itemID) {
		itemService.updateItem(i,itemID);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/items/{itemID}")
	public void deleteItem(@RequestBody Item i,@PathVariable String itemID) {
		itemService.deleteItemById(i,itemID);
	}
}
