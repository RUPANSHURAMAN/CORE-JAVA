package p2;
// 2) BY CREATING A THREAD USING RUNNABLE INTERFACE
public class A implements Runnable{
	public void run(){
		try {
			wait(1000); //can be accessed only inside run() not in main()
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<100; i++){
			System.out.println("Task 1");
		}
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		Thread t1 = new Thread(a1);
		t1.start();
		
		for (int i = 0; i<100; i++) {
			System.out.println("Task 2");
		}
	}

}
