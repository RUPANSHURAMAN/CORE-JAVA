package p5;

/*
 * SHORT: Anonymous classes can inherit the members of any other class, any other interface, local inner
 *  class, static inner class BUT cannot inherit outer class members
 */
public class A {
	static class B{
		int i = 10;
		static int j = 20;
		
		static void test1(){
			System.out.println("From static");
		}
		
		public void test(){
			System.out.println("From B");
		}
	}
	
	public static void main(String[] args) {
		B b1 = new B(){
			/*public void test1(){ //ERROR as can't override static method
				System.out.println("test1.Anonymous");
			}*/
			
			public void test(){
				System.out.println("test.Anonymous");
			}
		};
		b1.test(); //test-Anony OVERRIDED
		
		System.out.println(b1.i);//10
		System.out.println(b1.j);//20
		b1.test1();//From static
		// INHERITED_OVERRIDE_AND USE --> ANONYMOUS CLASS
	}
}
