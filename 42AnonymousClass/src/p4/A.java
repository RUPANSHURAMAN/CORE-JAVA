package p4;

/* Anonymous class can inherit the members of local inner class as well.
 *  
 *  NOte:
 * 		Inherit is mandat
 * 			|
 * 			 ----> other class members
 * 			|
 * 			 ----> interfaces
 * 			|
 * 			 ----> local inner class
 * 			|
 * 			 ----> static inner class
 * 			|
 * 			 ----> CAN'T inherit members of outer class
 * SHORT: inherit ANY class members but NOT members of outer class
 */
public class A {
	int i = 10;
	public void test(){
		
	}
	class B{
		int i = 10;
		void test(){
			
		}
		
		/*static void test1(){
			
		}*/
		static final int j = 20;
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = a1.new B(){ // inherit class B members
			
		};
		A a2 = new A(){ //NO ERROR as don't know why?
			public void test(){
				
			}
		};
		System.out.println(b1.i);//10
		System.out.println(b1.j); //20
		System.out.println(a2.i);//10
		a2.test();
		b1.test();
	}
}
