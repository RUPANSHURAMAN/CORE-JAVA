package p1;

public class AddWithoutArithmatic {
	public static void main(String[] args) {
		int a = 4, b = 5;
		
		//start main logic
		while (b != 0) {
			int carry = a & b; //4, 0
			a = a ^ b; //1, 9
			b = carry << 1; //8, 0
		}
		//end main logic
		
		System.out.println(a);
	}
}
