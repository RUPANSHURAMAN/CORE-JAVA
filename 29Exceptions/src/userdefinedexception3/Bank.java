package userdefinedexception3;

import userdefinedexception2.InsufficientFunds;

public class Bank {

	public static void main(String[] args) 
			throws InsufficientFunds{ // throws exception to calling method (here its JVM)
		
		throw new InsufficientFunds(); // gives addr of exception class
	}
}
