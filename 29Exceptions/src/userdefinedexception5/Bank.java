package userdefinedexception5;

import userdefinedexception2.InsufficientFunds;

public class Bank {

	public static void main(String[] args) 
			throws InsufficientFunds{ 
		 
		throw new InsufficientFunds();
		//System.out.println("Hello"); //it's not going to print as exception has happened before and pgm halts
	}
}
