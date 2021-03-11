package p1;

public class Rohombus {
	public static void main(String[] args) {
		int size = 5;

		for (int i = 0; i < size; i++) {

			for (int j = size; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = size; i > 0; i--) {
			for (int j = 0; j <= size - i; j++) {
				System.out.print(" ");
			}

			for (int j = 2 * i - 1; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}