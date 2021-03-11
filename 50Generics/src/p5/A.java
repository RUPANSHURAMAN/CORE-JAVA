package p5;

// Generic cannot be applied on a local var
public class A<X> {
	X i;
	X j;
	A a1;
	
	public X test(){
		a1 = new A();
		a1.i = 30.4f;
		return i;
	}
	
	public static void main(String[] args) {
		A a2 = new A();
		a2.j = a2.test();
		// X j = a2.test(); // ERROR as j can't be local
		//System.out.println(j);
	}
}
