package com.flipkart.comparators;

import java.util.Comparator;

import com.flipkart.entities.Items;

public class SortByPriceDescending implements Comparator<Items>{

	@Override
	public int compare(Items o1, Items o2) {
		
		return o2.getItemPrice() - o1.getItemPrice();
	}

	
	
}
