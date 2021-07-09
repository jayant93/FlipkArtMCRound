package com.flipkart.services;

import com.flipkart.entities.Inventory;
import com.flipkart.entities.Items;

public class InventoryServiceImpl implements InventoryService {

	@Override
	public boolean add(Items item, Integer quantity, Inventory inv) {

		try {
			inv.getItems().put(item, quantity);
		} catch (Exception ae) {
			ae.printStackTrace();
			return false;
		}

		return false;
	}

}
