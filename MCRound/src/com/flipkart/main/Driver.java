package com.flipkart.main;

import java.util.HashMap;

import com.flipkart.entities.Inventory;
import com.flipkart.entities.ItemGroup;
import com.flipkart.entities.Items;
import com.flipkart.services.FilterService;
import com.flipkart.services.InventoryServiceImpl;
import com.flipkart.services.SearchService;


public class Driver {

/*	AddItem(Amul, Milk, 100)
	AddItem(Amul, Curd, 50) 
	AddItem(Nestle, Milk, 60) 
	AddItem(Nestle, Curd, 90) */

	/*
	 * AddInventory(Amul, Milk, 10)
AddInventory(Nestle, Milk, 5)
AddInventory(Nestle,Curd,10) 
AddInventory(Amul, Milk, 10)
	 * 
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		InventoryServiceImpl inventoryServiceImpl = new InventoryServiceImpl();
		FilterService filterService = new FilterService();
		SearchService search = new SearchService();
		
	    ItemGroup itemGroup1 = new ItemGroup("Amul","Milk");
		itemGroup1.setId(itemGroup1.hashCode());
		
		//Creating Item 
		Items item1 = new Items(itemGroup1,100);
		item1.setId(item1.hashCode());		
		
		ItemGroup itemGroup2 = new ItemGroup("Amul","Curd");
		itemGroup2.setId(itemGroup2.hashCode());
		
		//Creating Item 
		Items item2 = new Items(itemGroup2,50);
		item2.setId(item2.hashCode());
		
		ItemGroup itemGroup3 = new ItemGroup("Amul","Milk2");
		itemGroup3.setId(itemGroup3.hashCode());
		
		//Creating Item 
		Items item3 = new Items(itemGroup3,60);
		item3.setId(item3.hashCode());
		
		
		ItemGroup itemGroup4 = new ItemGroup("Amul","Curd2");
		itemGroup4.setId(itemGroup4.hashCode());
		
		//Creating Item 
		Items item4 = new Items(itemGroup4,90);
		item4.setId(item4.hashCode());
		
		//adding it to inventory
		Inventory inventory  = new Inventory();
				
				HashMap<Items,Integer> itemsList = new HashMap<>();

				inventory.setItems(itemsList);
				inventory.setId(inventory.hashCode());
	
				inventoryServiceImpl.add(item1, 10, inventory);
				inventoryServiceImpl.add(item2, 5, inventory);
				inventoryServiceImpl.add(item3, 10, inventory);
				inventoryServiceImpl.add(item4, 20, inventory);
				
				inventory.showInventory();
				System.out.println("----------------------------------");
				filterService.filterByCategoryOrBrand(inventory, "Amul", true, false);
				System.out.println("----------------------------------");
				search.findItemWithLowestPrice(inventory);
				System.out.println("----------------------------------");
				search.findItemWithHighestPrice(inventory);
				System.out.println("----------------------------------");
				search.findItemWithLeastQuantity(inventory);
				
				
		
		

	/*	ItemGroup itemGroup2 = new ItemGroup("Amul","Curd");
		itemGroup1.setId(itemGroup2.hashCode());
		
		//Creating Item 
		Items item2 = new Items(itemGroup2,50);
		item2.setId(item2.hashCode());
		

		ItemGroup itemGroup3 = new ItemGroup("Nestle","Milk");
		itemGroup1.setId(itemGroup3.hashCode());
		
		//Creating Item 
		Items item3 = new Items(itemGroup3,60);
		item3.setId(item3.hashCode());
		
		
		ItemGroup itemGroup4 = new ItemGroup("Nestle","Curd");
		itemGroup1.setId(itemGroup4.hashCode());
		
		//Creating Item 
		Items item4 = new Items(itemGroup3,90);
		item4.setId(item4.hashCode());
		
		//adding it to inventory
		Inventory inventory  = new Inventory();
		
		HashMap<Items,Integer> itemsList = new HashMap<>();
		
		itemsList.put(item1,10);
		itemsList.put(item2,5);
		itemsList.put(item3,10);
		itemsList.put(item4,10);
		
		inventory.setItems(itemsList);
		inventory.setId(inventory.hashCode());
		inventory.showInventory();
		
		
	/*	while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter your choice : ");
			int choice = sc.nextInt();
			
			
		}*/
		
		
	}

}
