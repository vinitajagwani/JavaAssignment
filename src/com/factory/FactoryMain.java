package com.factory;

public class FactoryMain {
	public static void main(String []args) {
		OsFactory osf=new OsFactory();
		OS obj = osf.getInstance("dghnf");
		obj.spec();
	}
}
