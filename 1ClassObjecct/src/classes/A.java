package classes;
public class A {
	int i = 10;// non-static variable  
				// 1) non-static reference var declared outside methods but inside class
				// 2) it's not mandatory to initialize non-static variable, if we
				// 			do not initialize it is assigned by compiler a default value
				// 3) belongs to object memory and create object to access 
				// 4) copies of non-static var = no. of objects created 
				// 5) Global local (access by using object reference)
				
				// non-static member=object member=instance var
	
	static int j = 20; // static variable 
						// 1) static reference var declared outside methods but inside class using static keyword 
						// 2) not mandat initialize
						// 3) belongs to class common memory and to access <clas-name>.member_name
						// 4) one copy 
						// 5) and have global access

	
	public static void main(String[] args) {
		A a1 = new A(); // local reference var
		System.out.println(a1.i);
		System.out.println(a1);

		int j;
		// System.out.println(j); ERROR as local var be initialized
	}
	
	private void test1() { // non-static method
		int i = 1;// local variable cretated within a method 
					// method
		// local var can be accesed w/o reference 
		// local var should be initialized before use
		// local var garbage value
		// and should be used within the created
		System.out.println("No output");
		}
	}