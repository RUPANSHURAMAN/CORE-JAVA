package p1;

/*
 * Thread synchronization: When two threads are operating on a common data in a non-synchronised manner then
 * 		the data will get corrupted.
 * 
 * Threads always execute in part by part manner.
 * To thread from when two threads are interdependent(making tea by rommate e.g.) as deposit or
 * withdrawn we use Thread Join.
 * 
 * THEORY Q more in interview.
 */
public class A {
	int balance;
	public static void main(String[] args) {
		A a1 = new A();
		a1.account();
		System.out.println(a1.balance); // most of time 0 but sometimes -3, 579
	}
	private void account() {
		//Anonymous class helps us in creating Threads in one single class
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
		
		try{ // CTE so use try-catch
			t1.join();
			t2.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	// Both add and sub will execute on common data in part by part manner
	public void add(){
		for (int i = 0; i < 100 ; i++) {
			balance = balance + i;
		}
	}
	
	public void sub() {
		for (int i = 0; i < 100 ; i++) {
			balance = balance - i;
		}
	}
}
// PGM not mandat, only for Thread theory understanding. Similarly, for all threads