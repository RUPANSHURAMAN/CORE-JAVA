package finalkeyword;
//If you make an array as final then it's size can't be altered 
public class E {

	public static void main(String[] args) {
		final int[] a = new int[3];
		a[0] = 10;
		a[0] = 20;
		
		System.out.println(a[0]);
		
		//a = new int[4]; // ERROR as size can't change of ref as final
		
	}
}
