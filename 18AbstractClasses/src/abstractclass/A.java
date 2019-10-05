//COMPARE @ 16.A

/* mvocsm
 * Abstract class is 0 to 100% abstract, declared by abstract keyword
 * every method() [should have] abstract keyword to specify it is incomplete
 * static member can be accessed, created with or w/o initialization but can't be final
 * static method() can't be created as not inherited
 * we cannot create object of abstract class but can have main() so abstract class can run and also ref can be created 
 * * constructor can be created in abstract class as super() can be true, super(100) needed if interface has args constructor
 * abstract class does not support multiple inheritance 
  */

package abstractclass;

abstract public class A {
	
	static int a;
	static int b = 10;
	
	//abstract static void staticMethod(); // abstract static can't be created OWN
	A(){ //NO ERROR
		
	}
	
	public static void main(String[] args) { // NO ERROR
		
	}
	
	// public void test(); //ERROR as [abstract] keyword was not used and NOT applied by compiler
	
	public void xyz() {
		System.out.println("xyz");
}
}
