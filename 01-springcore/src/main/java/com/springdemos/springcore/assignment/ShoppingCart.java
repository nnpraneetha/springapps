package com.springdemos.springcore.assignment;

import java.util.List;

public class ShoppingCart {

	private String name;
	List<Item> items;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "ShoppingCart [name=" + name + ",\n items=" + items + "]";
	}

}
