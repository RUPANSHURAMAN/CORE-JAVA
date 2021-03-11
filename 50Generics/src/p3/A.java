package p3;

// Single generic with any data type
public class A<X> {
	X i;
	X j;
	X k;
	
	public static void main(String[] args) {
		A a1 = new A();
		//System.out.println(i);
		//System.out.println(j);
		//System.out.println(k); //For all 3 same error can't make static ref to non-static var
		System.out.println(a1.i);//null
		System.out.println(a1.j);//null
		System.out.println(a1.k);//null
		a1.i = 10;
		a1.j = 20.3;
		a1.k = 20.2f;
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a1.k);
	}
}
