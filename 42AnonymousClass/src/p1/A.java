package p1;

/*
 * Anonymous class works on the concept of inherit-override and use GROUND RULE] (NOT works w/o object creation): A class 
 * w/o any name is called as anonymous class 
 */
public class A {
	public static void main(String[] args) {
		B b1 = new B(){ // equivalent to implement for interface
			public void test(){
				System.out.println("From B");
			}
		};
		
		b1.test();
	}
}
