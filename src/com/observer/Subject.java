package com.observer;
public interface Subject {
	public void register(Observer observerObject);
	public void unregister(Observer observerObject);
	public void notifyObservers();
}
