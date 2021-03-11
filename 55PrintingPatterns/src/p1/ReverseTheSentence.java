package p1;

public class ReverseTheSentence {
	static String input = "I love programming which is easy to learn and so it is JAVA";
	static char[] inputArray = new char[input.length()];
	static int inputArrayCount = 0;

	public static void main(String[] args) {

		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) == ' ') {
				inputArrayCount = addWordToString(i + 1);
				inputArray[inputArrayCount++] = ' ';
			}
		}
		addWordToString(0);
		System.out.println(new String(inputArray));
	}

	private static int addWordToString(int indexWord) {
		while (indexWord != input.length() && input.charAt(indexWord) != ' ') {
			inputArray[inputArrayCount++] = input.charAt(indexWord++);
		}
		return inputArrayCount;
	}

}
