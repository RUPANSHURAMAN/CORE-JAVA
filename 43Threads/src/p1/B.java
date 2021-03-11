package p1;
//EXPERIMENT
public class B extends F{
	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(7000);//This prints after 7 seconds after loop so it is stopping main() to further execute
		
		int i =3;
		while(i-->=0){
			Thread.sleep(1000);//after 1 seconds pauses it keeps printing
			System.out.println("Raman");
		}
		
		F f1 = new B();
		f1.test();
		f1.test1();
	}

	public void test1() {
		// TODO Auto-generated method stub
		
	}
}

abstract class F{
	public void test(){
		
	}
	
	abstract public void test1();
}
