package p1;

public class B extends Thread{
	int balance;
	public void run(){
		for (int i = 0; i < 100; i++) {
			balance = balance + i; // Replaced by this.balance at non-static method as in static 
											//can't use this keyword
		}
		notify();
	}
}
