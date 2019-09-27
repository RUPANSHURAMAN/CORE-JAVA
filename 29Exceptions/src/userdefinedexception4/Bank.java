package userdefinedexception4;

import userdefinedexception2.InsufficientFunds;

public class Bank {

	public static void main(String[] args) 
			throws InsufficientFunds{ 
		System.out.println("Hello"); //it's going to print as exception at next line 
		throw new InsufficientFunds();
	}
}
