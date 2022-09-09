package com.amazon.atlas22.dynamicprogramming;

public class Item {
	
	char itemName;
	int profit;
	int weight;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(char itemName, int profit, int weight) {
		this.itemName = itemName;
		this.profit = profit;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", profit=" + profit + ", weight=" + weight + "]";
	}

}
