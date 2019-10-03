package userdefinedexception6;

import userdefinedexception2.InsufficientFunds;

public class Bank {

	public static void main(String[] args) {
			//throws InsufficientFunds{ 
		 
		try{throw new InsufficientFunds();}catch(Exception e) {}
		System.out.println("Hello"); //it's not going to print as exception has happened before and pgm halts
	}
}
