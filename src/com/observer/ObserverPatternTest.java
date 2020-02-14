package com.observer;
public class ObserverPatternTest {
 public static void main(String [] args) {
	 DeliveryData deliveryObject = new DeliveryData();
	 
	 Observer sellerObject=new Seller();
	 
	 Observer userObject=new User();
	 
	 Observer warehouseObject=new DeliveryWarehouse();
	 
	 deliveryObject.register(sellerObject);
	 deliveryObject.register(userObject);
	 deliveryObject.register(warehouseObject);
	 deliveryObject.locationChanged();
 }
}
