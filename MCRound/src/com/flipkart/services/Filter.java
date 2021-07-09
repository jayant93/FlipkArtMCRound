package com.flipkart.services;

import com.flipkart.entities.Inventory;
import com.flipkart.entities.Items;

public interface Filter {

	public void filterByCategoryOrBrand(Inventory inventory,String arg,boolean categoryFlag,boolean brandFlag);
	
	public void filterByPriceRange(Inventory inventory,int from,int to);
	
	
	
}
