package com.adapter;
public class ChromeDriver implements WebDriver {

	@Override
	public void getElement() {
		System.out.println("Get Element from Chrome Driver");
	}
	@Override
	public void setElement() {
		System.out.println("Select Element from Chrome Driver");
	}
}
