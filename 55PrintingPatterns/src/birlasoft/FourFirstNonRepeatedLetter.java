package birlasoft;
public class FourFirstNonRepeatedLetter {
	public static void main(String[] args) {
		String inputString = "aabcbbxxnnz";
		// output answer should be 'c'

		char answer = getFirstNonRepeatedCharacter(inputString);
		System.out.println("First non repeated character is: " + answer);
	}
	private static char getFirstNonRepeatedCharacter(String inputString) {
		for (int i = 0; i < inputString.length(); i++) {
			boolean repeatedFlag = false;
			for (int j = 0; j < inputString.length(); j++) {
				if (i != j && inputString.charAt(i) == inputString.charAt(j)) {
					repeatedFlag = true;
					break;
				}
			}
			if (!repeatedFlag)
				return inputString.charAt(i);
			else 
				repeatedFlag = false;
		}
		return (char) -1; //nothing found!
	}
}