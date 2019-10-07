package thiskeyword;

public class A {
/*
 *  this keyword points to the [current] object executing 
 *  every object created is a reference is also created by JVM which is accessed by this keyword
 *  [this] can be used to access static and non-static keyword, not local vars
 *  this keyword can't be used inside static like super
 *  this() to call constructor, but not in same as it's CTE ERROR and ONLY in constructor and not a second stat
 *  
 *  						++++++++++++++
 *  						|            |<-----------this(current)
 *  						|            |
 *  						|  Any       |
 *  						|  object    |<----------reference created by user
 *  						|            |
 *  				  		++++++++++++++
 *  						   on RAM
 */

// static int i; // static and non-static can never have same name as common space 
	// int i; // only static-local and non-static local can have same name
	int i = 10;
	static int j = 20;

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.i);
		System.out.println(a1.j); //both static and non-static vars
		a1.test();
		System.out.println(a1);
	}

	public void test() {
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this); // so this points to the same object as by a1 in main()
		this.test1();
	}
	
	public static void test1() {
	}
}
