package com.builder;
public class Order {
	public static void main(String args[]) {
		Pizza p =new PizzaBuilder().setSize(12).getPrice();
		System.out.println(p);
	}
}
