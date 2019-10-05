package classcasting6;

import classcasting2.A;

public class B extends A{

	public void xyz() {
		System.out.println("From test - B");
	}
	
	public static void main(String[] args) {
		A a1 = (A)new B(); //RECOMMENDED syntax to depict casting by user
		a1.test();
		//a1.xyz(); //ERROR as previous e.g.s
	}
}
