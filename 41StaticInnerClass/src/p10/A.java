package p10;

// Inheriting from static inner class to local inner class is possible
public class A {
	static class B{
		static int j = 10;
		int i = 10;
		void test(){
			
		}
		
		static void test1(){
			
		}
	}
	
	class C extends B{
		
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		C c1 = a1.new C();
		System.out.println(c1.i);
		System.out.println(c1.j); // replaced by B.j
		c1.test();
		c1.test1();
	}
}
