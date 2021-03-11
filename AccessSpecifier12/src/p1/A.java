package p1;

/* Constructor: if you make a constructor as private then its object can be created in the same class 
	but then we cannot create its object in different class e.g. below
	
	Note: object creation is available only in same class.
*/
public class A {
	private A(){
		System.out.println("From A constructor");
	}
	
	/*static  A(int i){ // ERROR as ONLY public protected or private or default is allowed
		System.out.println("From A constructor");
	}*/
	
	public static void main(String[] args) {
		A a = new A();
	}
}
