package p1;

public class RoundRate {
	public static void main(String[] args) {
		float f = 2.564f;
		int temp = (int) f;

		int fullValue = 0;
		int leftValue = 0; 
		
		while (temp>0) {
			temp/=10;
			fullValue++;
		}
		
		while (f%1!=0) {
			f*=10;
			leftValue++;
		}
		
		while (fullValue-->0) {
			System.out.print("full ");
		}
		
		while (leftValue-->0) {
			System.out.print("empty ");
		}
	}
}
