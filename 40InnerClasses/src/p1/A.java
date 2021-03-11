package p1;
/*
 * 							INNER CLASSES
 * 								 ||
 * 		===================================================
 * 		|						  |						  |	
 * 		|						  |						  |
 * 		|						  |						  |
 * 	Local Inner				Static Inner				Anonymous Inner
 * 		Classes				  Classes						Classes
 * 
 * CREATING CLASS WITHIN ANOTHER class is called as INNER class
 * 		1. Inner Class
 * 			|
 * 			|
 * 			|
 * 			====> Local Inner Classes: 
 * 					* To access members of local inner class firstly crate object of outer class then use the 
 * 						ref of outer class to create object of inner class then access the members of inner class
 * 						as shown below
 * 
 * adv:
 * 		1.It is a way of logically grouping classes that are only used in one place: If a class is useful 
 * 			to only one other class, then it is logical to embed it in that class and keep the two together. 
 * 			such "helper classes" makes their package more streamlined.
 * 		2.It increases encapsulation: Consider two top-level classes, A and B, where B needs access to 
 * 			members of A that would otherwise be declared private. By hiding class B within class A,
 * 			 A's members can be declared private and B can access them. In addition, B itself can be hidden 
 * 			from the outside world.
 * 		3.It can lead to more readable and maintainable code: Nesting small classes within top-level 
 * 			classes places the code closer to where it is used
 */
public class A {
	class B{
		B(){ //Constructor can be made
			
		}
		
		private B(int i){//private constructor can be made
			
		}
		
		/*public static void main(String[] args) {
			//main() can't be as static
		}*/
		
		
		int i = 10;
		//static int j = 20; //ERROR as static member can't be in non-static inner class, make static 
					//inner class then only possible
		static final int j = 20; //NO ERROR as final static, as can be accessed and value given so no need to 
										//instatiate
		
		/*final static void test(){ //ERROR w/o and with final as static method in non-static inner class
			
		}*/
		
		/*interface F{ //ERROR: The member interface F can only be defined inside a top-level class or interface
			
		}*/
		class F{ //NO ERROR for nested classes
			class G{
				class H{
					class I{
						
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		A a1 = new A();
		//B b1 = new B(); // ERROR as outer class object not created
		//System.out.println(b1.i);
	}
}
/*
 * access need to create outer object, access innner class var
 * constructor inner ok
 * static NOT OK but final OK and non-static OK ,main() NOT OK
 * inheritance of outer access outer members but w/o it not
 * multiple inner class possible
 * b/w two inner classes inheritance possible
 * IIB also create OK
 * SIB not as static
 * implements possible for inner class
 */
