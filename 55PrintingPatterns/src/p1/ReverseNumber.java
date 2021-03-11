package p1;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 123456;
		int reverseNumber = 0;
		while(number != 0){
			int remainder = number % 10; // last digit
			reverseNumber = (reverseNumber * 10) + remainder;
			number /= 10;
		}
		System.out.println(reverseNumber);
	}
}
