package ArrayReturnMethod;

public class A {

	public static void main(String[] args) {
		A a1 = new A();
		int[] b = a1.test1();
		for(int x:b) {
			System.out.println(x);
		}
	}
	
	public int[] test1() {
		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		return a;
	}
}
