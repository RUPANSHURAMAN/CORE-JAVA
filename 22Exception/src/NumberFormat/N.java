package NumberFormat;

public class N {

	public static void main(String[] args) {
		A[] a = new A[3];
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		a[0] = a1;
		a[1] = a1;
		a[2] = a1;
		
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//OR
		System.out.println("for-each=========");
		
		for(A b:a) {
			System.out.println(b);
		}
	}
}
