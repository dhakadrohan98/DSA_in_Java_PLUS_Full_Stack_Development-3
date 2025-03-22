package org.codeship.dao;

import java.util.ArrayList;
import java.util.List;

import org.codeship.entity.Item;

public class InventoryDao {
	//without connecting to actual db, use in-memory data structure
	private List<Item> items;
	
	public InventoryDao() {
		items = new ArrayList<>();
	}
	
	public void saveItem(Item item) {
		items.add(item);
	}
	
	public List<Item> getItem() {
		return items;
	}
}
