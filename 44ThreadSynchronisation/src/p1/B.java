package p1;

/*
 * Synchronization: If a method is made synchronized then a thread which acquires the object lock can only 
 * execute the method.
 * 
 * [Every object will have only one lock] whichever thread acquires the lock will execute synchronized method
 *  while the other thread has to wait for the lock to be released.
 *  
 * Thread will release the lock only after complete execution by doing this we're sure that once a 
 * particular thread executes completely only then next thread can start and this will avoid data corruption 
 * of common data.
 * 
 * 					=============
 * 					|	lock	|
 * 					=============
 * 
 * 					==============   synchronized
 * 					|			 |
 * 					|			 |
 * 			t1--->	|  syn.add() |
 * 					|  syn.sub() |  <----t2
 * 					|			 |
 * 					|			 |
 * 					==============
 * 
 * Thread join: It helps us to join the operations or task of two or more threads
 * 
 */
public class B {
	int balance;
	public static void main(String[] args) {
		B b1 = new B();
		b1.account();
		System.out.println(b1.balance); // 0 
	}
	private void account() {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				add(); // Replaced by this.add()
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				sub(); // Replaced by this.sub()
			}
		});
		
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public synchronized void add(){
		for (int i = 0; i < 100 ; i++) {
			balance = balance + i;
		}
	}
	
	public synchronized void sub() {
		for (int i = 0; i < 100 ; i++) {
			balance = balance - i;
		}
	}
}
