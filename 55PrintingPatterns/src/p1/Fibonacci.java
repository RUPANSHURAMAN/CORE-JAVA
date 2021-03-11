package p1;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		
		System.out.print(a+" "+ b);
		int c = 0;
		int repeatation = 5;
		while (repeatation-->0) {
			c = a+b;
			a = b;
			b = c;
			System.out.print(" " + c);
		}
	}
}
