package DataTypes;

public class Five4 {
	public static void main(String[] args) {
		int i = 10; // as local var so object creation not needed
		byte j = (byte) i;
		System.out.println(j);// 10 Output

		long m = 30;
		// During conversion if there is any loss of data then regardless of mem size we need to perform explicit downcasting
		j = (byte) m;
		System.out.println(j);
	}
}
