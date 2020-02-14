package com.builder;
public class Pizza {

	private int size,price;
	private String type;
	private String base;
	public Pizza(int size,String type,String base,int price) {
		super();
		this.size=size;
		this.type=type;
		this.base=base;
		this.price=price;
	}
	public String toString() {
		System.out.println("Pizza Time!!!!");
		return "size:"+size+" "+"type:" + type+" "+"base:"+ base+" "+"price:"+price;
	}
}
