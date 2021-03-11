package p1;

public class B {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.i); //NO ERROR as default can be accessed in same package
		System.out.println(a1.j); //NO ERROR as default can be accessed in same package
		a1.test();
		a1.test1();
	}
}
