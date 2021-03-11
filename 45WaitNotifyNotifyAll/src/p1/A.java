package p1;

/* Wait: It will halt the execution of the thread
 * 
 * Notify: It will end the wait of any one thread so that it can resume its execution.
 * 
 * NotifyAll: It will end the wait of all the threads at once which are in waiting status.
 * 		The threads will now execute in queue one after another.
 */

public class A {
	public static void main(String[] args) { //Thread
		B b1 = new B();
		b1.start();
		synchronized (b1) {
			try{
				b1.wait();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		System.out.println(b1.balance);
	}
}

// Note: wait(), notify(), & notifyAll() belongs to Object class