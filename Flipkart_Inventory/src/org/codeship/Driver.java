package org.codeship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codeship.dao.InventoryDao;
import org.codeship.service.InventoryService;

public class Driver {

	public static void main(String[] args) {
		InventoryService inventoryService = new InventoryService(new InventoryDao());
		try {
			// add items
			inventoryService.addItem("Amul", "Milk", 100);
			inventoryService.addItem("Amul", "Curd", 50);
			inventoryService.addItem("Nestle", "Milk", 60);
			inventoryService.addItem("Nestle", "Curd", 90);

			inventoryService.addInventory("Amul", "Milk", 20);
			inventoryService.addInventory("Amul", "Curd", 5);
			inventoryService.addInventory("Nestle", "Milk", 5);
			inventoryService.addInventory("Nestle", "Curd", 10);
			inventoryService.addInventory("Amul", "Milk", 7);

			//searchItem(brand, category,priceFrom, priceTo, sortBy, orderBy)
			System.out.println("Search by brand (Nestle):");
			inventoryService.searchItem(Arrays.asList("Nestle"), null, null, null, "price", "asc");

			System.out.println("\nSearch by category (Milk):");
			inventoryService.searchItem(null, Arrays.asList("Milk"), null, null, "price", "asc")
					.forEach(System.out::println);

			System.out.println("\nSearch by category (Milk) ordered by price descending:");
			inventoryService.searchItem(null, Arrays.asList("Milk"), null, null, "price", "desc")
					.forEach(System.out::println);

			System.out.println("\nSearch by price range (70 to 100):");
			inventoryService.searchItem(Arrays.asList("Nestle"), null, 70, 100, "price", "desc").forEach(System.out::println);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
