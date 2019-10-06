//COMPARE @ 16.A

/* mvocsm
 * Abstract class is 0 to 100% abstract, declared by abstract keyword
 * every method() [should have] abstract keyword to specify it is incomplete
 * var by default is not final, have to make it final
 * static member can be accessed, created with or w/o initialization
 * static method() can be created
 * we cannot create object of abstract class but ref can be created, can have main() so abstract class can run
 * * constructor can be created in abstract class as super() can be true, super(100) needed if interface has args constructor
 * abstract class does not support multiple inheritance 
  */

package abstractclass;

abstract public class A {
	
	static int a;
	static int b = 10;
	int j;
	
	static void test1() {
		
	}
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
