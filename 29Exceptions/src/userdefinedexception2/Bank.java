package userdefinedexception2;

//user defined EXCEPTION steps: 1. user define exception class 2. throw keyowrd to throw exception
public class Bank {

	public static void main(String[] args) {
		int balance = 50000;
		int amount = 100000;
		
		if(amount > balance) {
			// throw new InsufficientFunds(); need to surroound in try-catch
			try {
				throw new InsufficientFunds(); //throw keyword gives memory address of object of exception and gives it to catch
			}catch (Exception e) {
				System.out.println(e);
			}
		}else {
			System.out.println("Please collect the cash");
		}
	}
}
