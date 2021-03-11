package p1;
// Private: Same class

/*
 * ACCESS SPECIFIER: Controlling a var where all it can be accessed or modifying access of
 *  member s.t. it can be used only in certain places
 *  
 * 			  	| private | default | protected | public |
 * =====================================================
 * Same class 	|   yes	  |	yes	    |   yes     |  yes   |
 * -----------------------------------------------------
 * Same package |   no	  | yes		|   yes		|  yes	 |
 * sub class	|		  |			|			|		 |
 * -------------------------------------------------------
 * Same package |   no	  | yes		|   yes		|  yes	 |
 * non-subclass |		  |			|			|		 |
 * -------------------------------------------------------
 * Diff package	|	no	  |	no		| 	yes		|	yes	 |
 * sub class	|		  |			|			|		 |
 * -------------------------------------------------------
 * Diff package	|	no	  |	no		|	no		|	yes	 |
 * non-subclass |		  |			|			|		 |
 * 
 */

public class A {
	private int i = 10;
	private static int j = 10;
	
	private void test(){
		System.out.println("test");
	}
	
	private static void test1(){
		System.out.println("test1");
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.i); //Same class private non-static member can be accessed
						//ERROR as nothing is accessible in drop down except main()
		System.out.println(a1.j); //Same class private static member can be accessed
						//ERROR as nothing is accessible in drop down except main()
		
		A a2 = new A();
		a2.test();// private non-static method can be accessed in the same class only
		a2.test1();// private static method can be accessed in the same class only
	}
}
