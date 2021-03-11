package p2;

// Multiple generics can also be used
public class A<X, Y, Z> {
	X i;
	Y j;
	Z k;
	
	X test(X m, Y n, Z o){
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		//m. gives object members when dot used
		Integer z = (Integer)m;
		System.out.println(z.getClass());
		return m;
	}
	public static void main(String[] args) {
		A a1 = new A();
		a1.i = 10;
		a1.j = 20.3;
		a1.k = 20.2f;
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a1.k);
		System.out.println(a1.test(7, "we", 10.8));
		
		/* O/P
		 * 10
		 * 20.3
		 * 20.2
		 * 7
		 * we
		 * 10.8
		 * class java.lang.Integer
		 * 7
		 */
	}
}
