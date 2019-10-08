package ArrayReturnMethod;

import java.lang.reflect.Array;

public class D {

	public static void main(String[] args) {
		int[] a = new int[3];
		Array.setShort(a, 2, (short)3);
		
		for(int i:a) {
			System.out.println(i);
		}
	}
}
