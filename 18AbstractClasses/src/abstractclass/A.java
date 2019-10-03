//* abstract class is 0 to 100% incomplete, declared by abstract keyword
// every method should have abstract keyword to specify it is incomplete
// static member  can be accessed, constructor can be created
// can't create object of abstract class but can have main()
package abstractclass;

abstract public class A {
	
	// public void test(); //ERROR as [abstract] keyword was not used and NOT applied by compiler
	
	public void xyz() {
		System.out.println("xyz");
}
}
