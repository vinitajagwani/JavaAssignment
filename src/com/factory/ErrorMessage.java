package com.factory;
class InvalidInput extends Exception{  
	InvalidInput(String s){  
	 super(s);
	 }  
	} 
public class ErrorMessage implements OS {
	@Override
	public void spec() {
		try {
			throw new InvalidInput("Enter valid Os!!!");
		} catch (InvalidInput e) {
			System.out.println(e.getMessage());
		}
	}

}
