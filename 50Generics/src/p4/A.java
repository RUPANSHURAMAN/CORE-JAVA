package p4;

public class A<X> {
	X i;
	A a1;
	
	public X test(){
		a1 = new A();
		a1.i = 30.4f;
		return i;
	}
	
	public static void main(String[] args) {
		A a2 = new A();
		//X j = a2.test(); //NOT WORKS as local var X [generic can't be made local]
		a2.test();	//but [making non-static works]
		System.out.println();
	}
}
