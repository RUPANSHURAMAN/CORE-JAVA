package thiskeyword;

public class A {
/*
 *  this keyword points to the [current] object executing 
 *  every object created is a reference is also created by JVM which is accessed by this keyword
 *  [this] can be used to access static and non-static keyword
 *  this keyword can't be used inside static like super
 *  this() to call constructor
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
	int i = 10;

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.i);
		a1.test();
		System.out.println(a1);
	}

	public void test() {
		System.out.println(this.i);
		System.out.println(this); // so this points to the same object as by a1 in main()
	}
}
