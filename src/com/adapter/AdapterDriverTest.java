package com.adapter;
public class AdapterDriverTest {
	public static void main(String []args) {
		ChromeDriver ChromeDriverObj=new ChromeDriver();
		ChromeDriverObj.getElement();
		ChromeDriverObj.setElement();
		WebDriverAdapter webDriverAdapter=new WebDriverAdapter(new InternetExplorerDriver());
		webDriverAdapter.getElement();
		webDriverAdapter.setElement();
	}
}
