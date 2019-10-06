package superkeyword5;

import superkeyword3.A;
public class B extends A{

	B(){
		/*super();*/  //super keyword auto added by compiler and can ONLY call no args contrutor
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		new B();
	}
}
