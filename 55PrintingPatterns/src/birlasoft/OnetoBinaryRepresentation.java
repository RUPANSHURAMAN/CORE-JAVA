package birlasoft;
public class OnetoBinaryRepresentation {
	public static void main(String[] args) {
		int number = 12;
		System.out.println(toBinaryString(number));
	}

	// Main Logic
	private static String toBinaryString(int number) {
		String tempString = "";
		while (number != 0) {
			int remainder = number % 2;
			tempString = tempString + remainder;
			number /= 2;
		}

		// reverse the binary answer
		String binaryString = "";
		for (int i = tempString.length() - 1; i >= 0; i--) {
			binaryString = binaryString + tempString.charAt(i);
		}
		
		return binaryString;
	}
}
