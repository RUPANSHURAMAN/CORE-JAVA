package ArrayReturnMethod;

public class B {

	public static void main(String[] args) {
		int[][] a = new int[2][3];
		
		a[0][0] = 10;
		a[0][1] = 100;
		a[0][2] = 1000;
		
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
	}
}
