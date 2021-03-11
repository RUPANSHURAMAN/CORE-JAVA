package p1;

public class PyramidRowNoDisplay {
	public static void main(String[] args) {
		int size = 5;
		for (int i = 0; i < size; i++) {

			for (int j = size; j > i; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= 2 * i; j++) {
				System.out.print(i);
			}

			System.out.println();
		}
	}
}
