package com.flipkart.services;

import com.flipkart.entities.Inventory;

public interface Search {

	public void findItemWithLowestPrice(Inventory inventory);

	public void findItemWithHighestPrice(Inventory inventory);

	public void findItemWithLeastQuantity(Inventory inventory);

}
