package org.codeship.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.codeship.dao.InventoryDao;
import org.codeship.entity.Item;
import org.codeship.model.response.ItemResponse;

public class InventoryService {
	
	private InventoryDao inventoryDao;
	
	public InventoryService(InventoryDao inventoryDao) {
		this.inventoryDao = inventoryDao;
	}
	
	public void addItem(String brand, String category, Integer price) {
		if(brand == null || category == null || price <= 0.0) {
			throw new IllegalArgumentException("Invalid data is passed or price can never be zero or negative");
		}
		inventoryDao.saveItem(new Item(category, brand, price, 0));
	}
	
	public void addInventory(String brand, String category, Integer quantity) {
		if(brand == null || category == null || quantity <= 0) {
			throw new IllegalArgumentException("Invalid data is passed. Brand or Category is not passed");
		}
		for(Item item : inventoryDao.getItem()) {
			if(item.getBrand().equalsIgnoreCase(brand) && item.getCategory().equalsIgnoreCase(category)) {
				item.setQuantity(item.getQuantity() + quantity);
				return;
			}
		}
		//add as new item in the inventory
		inventoryDao.saveItem(new Item(category, brand, 0, quantity));
	}
	
	public List<Item> searchItem(List<String> brand, List<String> category, Integer priceFrom, Integer priceTo, 
			String sortBy, String orderBy){
		System.out.println(brand + " " + category + " " + priceFrom + " " + priceTo + " " + sortBy + " " + orderBy);
		List<Item> filteredItems = new ArrayList<>();
		//search item based on brand & category in the list of Item 
		for(Item item : inventoryDao.getItem()) {
			if(((brand != null && brand.contains(item.getBrand())) ||
			   (category != null && category.contains(item.getCategory()))) &&
			   ((priceFrom == null && priceTo == null) || (priceFrom <= item.getPrice() && item.getPrice() <= priceTo)))
			{
				filteredItems.add(item);
			}
		}
		//if filteredItem list has one item at least then apply sorting & ordering
		if(filteredItems.size() > 0) {
			Comparator<Item> comparator = getComparator(sortBy, orderBy);
			Collections.sort(filteredItems, comparator);
		}
		return filteredItems;
	}
	
	public Comparator<Item> getComparator(String sortBy, String orderBy) {
		//sort the item based on price in ascending order as default criteria
		Comparator<Item> comparator = Comparator.comparingInt(Item::getPrice);
		if(sortBy.equalsIgnoreCase("quantity")) {
			comparator = Comparator.comparingInt(Item::getQuantity);
		}
		if(orderBy.equalsIgnoreCase("desc")) {
			comparator = comparator.reversed();
		}
		return comparator;
	}
}
