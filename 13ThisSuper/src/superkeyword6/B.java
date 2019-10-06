package superkeyword6;

import superkeyword3.A;
public class B extends A{

	B(int i){
		//super(); //even in arg constructor super keyword is added auto by compiler of no-arg type
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		new B(100);
	}
	
}
