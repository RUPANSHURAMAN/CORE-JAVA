package p2;

import p1.A;

public class B extends A{
	public static void main(String[] args) {
		B b1 = new B();
		//System.out.println(b1.i); //ERROR as default can't be accessed in diff package only main() accessible
		//System.out.println(b1.j); //ERROR as default can't be accessed in diff package only main() accessible
		//b1.test(); ////ERROR as default can't be accessed in diff package only main() accessible
		//b1.test1(); ////ERROR as default can't be accessed in diff package only main() accessible
	}
}
