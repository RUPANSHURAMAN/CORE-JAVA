package p1;

/*	
 * 							THREAD
 * * Which thread will be executed first is dependent on the priority.
 * 
 * * Priority is classified into:-
 * 					1. NORM_PRIORITY (represent value 5)
 * 					2. MAX_PRIORITY (represent value 10)
 *  				3. MIN_PRIORITY (represent value 0)
 * 
 * * When a programmer set the priority, it is request.
 * 
 * * But when priority is set internally it's a command.
 * 
 */
public class A extends Thread {
	
	public void run() {
		System.out.println("Running");
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.start();
		a1.setPriority(NORM_PRIORITY);
		System.out.println(a1.getPriority());
		a1.setPriority(MAX_PRIORITY);
		System.out.println(a1.getPriority()); // O/P depends on JVM as sometimes set sometimes not
		a1.setPriority(MIN_PRIORITY);
		System.out.println(a1.getPriority());
	}
}
