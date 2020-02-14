package com.observer;
import java.util.ArrayList;
import java.util.List;
public class DeliveryData implements Subject{
	private List<Observer> listOfObservers;
	private String location;
	public DeliveryData() {
		this.listOfObservers = new ArrayList<>();
	}
	@Override
	public void register(Observer observerObject) {
		listOfObservers.add(observerObject);
	}
	@Override
	public void unregister(Observer observerObject) {
		listOfObservers.remove(observerObject);
		
	}
	@Override
	public void notifyObservers() {
		for(Observer observerobj:listOfObservers) {
			observerobj.update(location);
		}
		
		
	}
	public String getLocation() {
		return "Yplace";
	}
	public void locationChanged() {
		this.location= getLocation();
		notifyObservers();
	}

}
