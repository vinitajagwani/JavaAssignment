package com.builder;
public class PizzaBuilder {

	private int size,price;
	private String type;
	private String base;
	
	public PizzaBuilder setSize(int size) {
		this.size = size;
		return this;
	}
	public PizzaBuilder setType(String type) {
		this.type = type;
		return this;
	}
	public PizzaBuilder setBase(String base) {
		this.base = base;
		return this;
	}
	public PizzaBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	public Pizza getPrice() {
		switch(size) {
		case 8:
			price=500;
			break;
		case 12:
			price=700;
			break;
		case 18:
			price=1000;
			break;
		}
		return new Pizza(size,type,base,price);
	}
//	public Pizza getPizza() {
//		return new Pizza(size,type,base);
//	}
	
}
