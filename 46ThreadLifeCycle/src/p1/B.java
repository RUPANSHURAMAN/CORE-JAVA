package p1;

/*
 * Deadlock: When two threads are waiting for each other to release the lock and neither of the thread is
 * 				releasing the lock then these threads has got into deadlock state.
 * 
 *  Thread getState(): To see the current state of the Thread we use getState() of Thread class
 * 
 */
public class B extends Thread{
	public void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.getState()); // NEW
		b1.start();
		System.out.println(b1.getState()); // RUNNABLE
		try{
			System.out.println("5"+b1.getState()); //as before 5 seconds the main() terminates so o/p RUNNABLsE
			Thread.sleep(5000);				//Running (coz of delay of 5 sec
			System.out.println(b1.getState()); //as after 5 seconds the main() terminates so o/p TERMINATED
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(b1.getState()); // TERMINATED
		
	}
}
