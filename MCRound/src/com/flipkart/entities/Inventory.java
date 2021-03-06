package com.flipkart.entities;

import java.util.HashMap;
import java.util.Map.Entry;


public class Inventory {

	 private Integer Id;
	//contains items as key and Quantity as value
	private HashMap<Items,Integer> items;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	
	
	public HashMap<Items, Integer> getItems() {
		return items;
	}
	public void setItems(HashMap<Items, Integer> items) {
		this.items = items;
	}

	public void showInventory() {
		for(Entry<Items, Integer> map : items.entrySet()) {
			System.out.println(map.getKey().getItem().getCategory()+" --> "+
					map.getKey().getItem().getBrand()+" -->"+map.getValue());
		}
		
	}
	
}
