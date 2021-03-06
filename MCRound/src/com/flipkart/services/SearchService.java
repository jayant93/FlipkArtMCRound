package com.flipkart.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.NavigableMap;

import com.flipkart.comparators.SortByPriceAscending;
import com.flipkart.comparators.SortByPriceDescending;
import com.flipkart.comparators.SortByValues;
import com.flipkart.entities.Inventory;
import com.flipkart.entities.Items;

public class SearchService implements Search{

	@Override
	public void findItemWithLowestPrice(Inventory inventory) {
		
		List<Items> itemsInInventory = new ArrayList<>();
	 
		for(Entry<Items, Integer> map : inventory.getItems().entrySet()) {
			itemsInInventory.add(map.getKey());
		}
		

        Collections.sort(itemsInInventory,new SortByPriceAscending());
        
        for(Items i : itemsInInventory) {
        	System.out.println(i.getItem().getCategory()+" -- "+i.getItem().getBrand()+"  -- "+i.getItemPrice());
        }
		
	}

	@Override
	public void findItemWithHighestPrice(Inventory inventory) {
		List<Items> itemsInInventory = new ArrayList<>();
		 
		for(Entry<Items, Integer> map : inventory.getItems().entrySet()) {
			itemsInInventory.add(map.getKey());
		}
		

        Collections.sort(itemsInInventory,new SortByPriceDescending());
        
        for(Items i : itemsInInventory) {
        	System.out.println(i.getItem().getCategory()+" -- "+i.getItem().getBrand()+"  -- "+i.getItemPrice());
        }
		
		
	}

	@Override
	public void findItemWithLeastQuantity(Inventory inventory) {
		
	    List<Entry<Items, Integer>> list = new 
				LinkedList<Entry<Items, Integer>>(inventory.getItems().entrySet());  
		
		Collections.sort(list,new SortByValues());	
		
		
		for(Entry<Items, Integer> i : list) {
        	System.out.println(i.getKey().getItem().getCategory()+" -- "+
		i.getKey().getItem().getBrand()+"  -- "+i.getValue());
        }
		
		
		
	}

	

}
