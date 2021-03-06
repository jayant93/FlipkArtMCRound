package com.flipkart.entities;

//class to hold information of specific item
public class Items {
	
		private Integer Id;
		private ItemGroup item;
		private int itemPrice;

		public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public Items(ItemGroup item, int itemPrice) {
			super();
			this.item = item;
			this.itemPrice = itemPrice;
		}
		public ItemGroup getItem() {
			return item;
		}
		public void setItem(ItemGroup item) {
			this.item = item;
		}
		public int getItemPrice() {
			return itemPrice;
		}
		public void setItemPrice(int itemPrice) {
			this.itemPrice = itemPrice;
		}
		

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Items other = (Items) obj;
	        if (Id != other.Id)
	            return false;
	        return true;
	    }
		
}
