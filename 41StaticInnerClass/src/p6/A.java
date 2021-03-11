package p6;

// Inheritance b/w two static inner class is possible
public class A {
	static class C{
		int i = 10;
		final static int k = 20;
		int j = 20; //NO error as not inherited to b
		
		void test(){
			
		}
	}
	
	static class B extends C{
		int j = 20;
		
		void test(){ //Overrided
			
		}
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.j);//20
		System.out.println(b1.i);//10
		System.out.println(b1.k);//20
		b1.test();
		
	}
}
