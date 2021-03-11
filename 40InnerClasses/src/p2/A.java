package p2;

// To access method of inner class 
public class A {
	
	class B{
		public void test(){
			System.out.println("From test");
		}
		
		static final int j = 20;
		//static int k = 10; //ERROR as non-final static can't be in non-static inner class
	}
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = a1.new B();
		b1.test();
		System.out.println(b1.j);//20
	}
	
	// Inner class provides us security
}
