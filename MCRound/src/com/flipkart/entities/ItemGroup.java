package com.flipkart.entities;

//Common class for Items and inventory
//as both needs category and brand
public class ItemGroup {
	
	private Integer Id;
	private String category;
	private String brand;
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public ItemGroup(String category, String brand) {
		super();
		this.category = category;
		this.brand = brand;
	}
	
	
	

}
