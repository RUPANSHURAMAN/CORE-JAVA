package birlasoft;

public class ThreeMaxAndSecondMax {
	public static void main(String[] args) {
		int[] numbers = new int[] { 20, 5, 7, 8, 45 };
		int max = numbers[0];
		int secondMax = numbers[0];

		// Finding max
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}

		// Finding max
		for (int i = 0; i < numbers.length; i++) {
			if (max != numbers[i] && secondMax < numbers[i]) {
				secondMax = numbers[i];
			}
		}
		
		System.out.println("Max = "+ max + " secondMax="+secondMax);
	}
}
