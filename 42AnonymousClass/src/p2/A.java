package p2;

// Anonymous class auto inherits the members of the object created before it.
public class A {
	public static void main(String[] args) {
		C c1 = new C(){// concept of inheritance here equivalent to extends
			public void test(){
				System.out.println("From B");
			}
		};
		c1.test();
	}
}
