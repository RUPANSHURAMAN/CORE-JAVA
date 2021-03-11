package p3;

/*
 * Note: 1. We cannot create static local members in an inner class except static final vars e.g. below
 * 2. Static members can't be used inside local inner class.
 */
public class A {
	class B{
		//static int i = 10; // ERROR as static declared in non-static inner type
		
		/*public static void test(){ // ERROR as static declared in non-static inner type
			System.out.println("From test");
		}
		*/
		static final int j=10; //as can be accessed and value given so no need to instatiate
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = a1.new B();
		System.out.println(b1.j);//20
		//System.out.println(b1.test());// ERROR as static declared in non-static inner type 
	}
}
