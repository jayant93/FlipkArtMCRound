package com.flipkart.services;

import java.util.Map.Entry;

import com.flipkart.entities.Inventory;
import com.flipkart.entities.Items;

public class FilterService implements Filter{

	@Override
	public void filterByCategoryOrBrand(Inventory inventory,String arg, 
			boolean categoryFlag, boolean brandFlag) {
				
		if(categoryFlag) {
			
			for(Entry<Items, Integer> map : inventory.getItems().entrySet()) {
				
				if(map.getKey().getItem().getCategory().equals(arg)) {
					
					System.out.println(map.getKey().getItem().getCategory()+" --> "+
							map.getKey().getItem().getBrand()+" -->"+map.getValue());
				}
				
			}
			
		}
		
		if(brandFlag) {
			for(Entry<Items, Integer> map : inventory.getItems().entrySet()) {
				if(map.getKey().getItem().getBrand().equals(arg)) {
					System.out.println(map.getKey().getItem().getCategory()+" --> "+
							map.getKey().getItem().getBrand()+" -->"+map.getValue());
				}
				
			}
		}	
		
		
	}

	@Override
	public void filterByPriceRange(Inventory inventory,int from, int to) {
		// TODO Auto-generated method stub
		
		for(Entry<Items, Integer> map : inventory.getItems().entrySet()) {
			
			if(map.getKey().getItemPrice() >= from && 
					map.getKey().getItemPrice() <= to) {
				
				System.out.println(map.getKey().getItem().getCategory()+" --> "+
						map.getKey().getItem().getBrand()+" -->"+map.getValue());
				
			}
			
		}
		
	}

}
