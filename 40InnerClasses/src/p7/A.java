package p7;

/*
 * Static members of outer class can be inherited into local inner classes but then static members can't be
 * created in local inner class
 */
public class A {
	static int i = 10;
	class B extends A{
		//static int j = 20;// ERROR
		final static int j = 10;
		
		void test(){
			
		}
		
		/*static void test(){ //ERROR as static
			
		}*/
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = a1.new B();
		System.out.println(b1.i); // Actually converted to <class-name>.static_member i.e. A.i
		System.out.println(b1.j);
		b1.test();
	}
}
