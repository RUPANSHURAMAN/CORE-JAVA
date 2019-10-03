package p2;

import p1.A;

public class C implements A {// ERROR without import as in different package

	public void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		C c1 = new C();
		c1.test();
	}

}
