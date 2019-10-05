package NumberFormat;
//ArrayIndexOutOfBoundsException
public class E {

	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 100;
		a[2] = 1000;
		a[3] = 10000; //ArrayIndexOutOfBoundsException
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
	}
}
