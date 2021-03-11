package p7;

// Creating an object of inner class cannot access members of outer class (SAME AS LOCAL INNER CLASS)
public class A {
	int i = 10;
	static int k = 10;
	static class B{
		int j = 20;
		static int i = 10;
		
		void test(){
			
		}
		
		void test1(){
			
		}
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		//System.out.println(b1.i); // ERROR can't access outer by using inner class object
		// System.out.println(b1.k); //ERROR cannot be resolved
	}
}
