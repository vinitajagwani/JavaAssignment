package com.factory;


public class OsFactory {

	public OS getInstance(String str) {
		if(str.equalsIgnoreCase("Open"))
				return new Android();
		else if(str.equalsIgnoreCase("Secured"))
				return new IOS();
		else if(str.equalsIgnoreCase("Properietary"))
			return new BlackBerry();
		else if(str.equalsIgnoreCase("Old"))
			return new Windows();
		else
			return new ErrorMessage();
		
	}
}
