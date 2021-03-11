package p1;

/*
 * THREADS(java.lang.Thread)
 * =======
 * Threads: Multitasking done at the pgm level is called as Threads
 * 
 * There are two ways to create Threads by using
 * 		1) By Thread class: Here we inherit run() method from Thread class and then we override it in the user
 * 			defined class.
 * 			* To start run() thread we use start method of thread class.
 * 			* Run Thread is a user defined thread whereas main() thread is default thread.
 * 			* Always main Thread runs first and then the user defined thread
 * 			
 */
public class A extends Thread{
	public void run(){
		for(int i = 0; i<100; i++){
			System.out.println("Task 1");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		A a1 = new A();
//		a1.start();
		a1.run();
		Thread.sleep(5000);
		System.out.println("Raman");// after 100 test2 Raman is printed after 5 seconds
		for(int i = 0; i<100; i++){
			System.out.println("Task 2");
		}
	}
}

/*
 *  NOte: which thread will execute for how much time can't be predicted by the programmer as it is decided
 *  by the processor depending on its availability .
 */

