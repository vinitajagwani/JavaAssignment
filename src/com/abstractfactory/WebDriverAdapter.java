package com.abstractfactory;
public class WebDriverAdapter implements WebDriver {
	InternetExplorerDriver internetExplorer;
	public WebDriverAdapter(InternetExplorerDriver internetExplorer) {
		super();
		this.internetExplorer = internetExplorer;
	}
	@Override
	public void getElement() {
		internetExplorer.findElement();	
	}
	@Override
	public void setElement() {
		internetExplorer.clickElement();
	}
}
