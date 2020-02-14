package com.observer;
public class DeliveryWarehouse implements Observer {
	private String location;
	@Override
	public void update(String location) {
	this.location=location;
	showLocation();
	}
	public void showLocation() {
		System.out.println("Notification at Delivery Warehouse - Current Location "+ location);
	}
}
