package p1;

/*
 *  Static inner class: In this class we can keep static and non-static members both. w/o creating
 *  object of outer class 
 */

public class A {
	static class B{ // [static and non-static members can be declared in static class]
		static int i; //DIFF static classes syntax is diff as object of outer class creation not needed
		int j = 20;
		
		static void test(){
			
		}
		
		final static void test1(){
			
		}
		
		static final int k =20;
		
		B(){ //Constructor can be made
			
		}
		
		private B(int i){//private constructor can be made
			
		}
		
		public static void main(String[] args) {
			//main() can't be as static
		}
		
		
		static int m = 20; 
		/*final static void test(){ //ERROR w/o and with final as static method in non-static inner class
			
		}*/
	}
	
	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(B.i); // DIFF syntax is diff as object of outer class creation not needed for static
		System.out.println(b1.j);
	}
}

/*
 * for access, no need to create outer object to access innner class var
 * constructor static inner ok
 * static and non-static OK, main() OK executed when called
 * inheritance of outer class can access outer members but w/o it not
 * multiple static inner class possible
 * b/w two static inner classes inheritance possible
 * Inheriting local class members into static class is not possible
 * Inheriting from static inner class to local inner class is possible
 * IIB also create OK
 * SIB yes as static
 * implements possible for static inner class
 */
