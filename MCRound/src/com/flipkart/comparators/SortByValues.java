package com.flipkart.comparators;

import java.util.Comparator;
import java.util.Map;

import com.flipkart.entities.Items;

public class SortByValues implements Comparator<Map.Entry<Items, Integer>> {

	public int compare(Map.Entry<Items, Integer> o1, Map.Entry<Items, Integer> o2) {
		return (o1.getValue()).compareTo(o2.getValue());
	}

}
