package p8;

// static inner class can implement interfaces (AS LOCAL INNER CLASS)
public class A {
	static class B implements C{
		public void test(){
			System.out.println("From test");
		}
		
		public void test1(){
			System.out.println("From test1");
		}
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		b1.test();//From test
		b1.test1();//From test1
	}
}
