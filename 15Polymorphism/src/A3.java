//while overring if you are increasing the scope of access specifier then it will not give any error  
// public--->default--->protected--->private //overring depends on access specifier 

//About inheriance rules not overriding rules:  default can never be inherited in different package
//public inherit any package //private caan't be inherited //protected same package different package 

public class A3 { //extends A1{ error as decreasing scope

	// ERROR: if private
	protected void test1() {
		System.out.println("A");
	}

//default to public overrided to increase scope 
	void test2() {
		System.out.println("A2");
	}
}
