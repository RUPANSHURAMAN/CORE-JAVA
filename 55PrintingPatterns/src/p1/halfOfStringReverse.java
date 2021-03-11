package p1;

public class halfOfStringReverse {
	public static void main(String[] args) {
		String input = "helloWorld";
		
		//MAIN LOGIC START---
		char[] inputCharArray = input.toCharArray();
		int lastChar = (input.length()/2)-1;
		
		for (int i = 0; i <= lastChar; i++) {
			inputCharArray[i] = input.charAt(lastChar-i);
		}
		//MAIN LOGIC END----
		
		System.out.println(input = new String(inputCharArray));
	}
}
