package com.flipkart.services;

import com.flipkart.entities.Inventory;
import com.flipkart.entities.Items;

public interface InventoryService {

	public boolean add(Items item,Integer quantity,Inventory inv);
	
}
