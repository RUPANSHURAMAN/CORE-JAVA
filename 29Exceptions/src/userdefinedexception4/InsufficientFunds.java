package userdefinedexception4;
//throw keyword helps us to take the memory addr of the object and give it to catch

public class InsufficientFunds extends Exception{

	public InsufficientFunds() {
		System.out.println("Low balance!!");
	}
	
}
