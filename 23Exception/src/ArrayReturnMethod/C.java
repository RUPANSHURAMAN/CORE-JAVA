package ArrayReturnMethod;

public class C {

	public static void main(String[] args) {
		int[][] a = new int[20][30];
		
		a[0][0] = 10;
		a[0][1] = 100;
		a[0][2] = 1000;
		
		System.out.println(a.length); //ROW size = 20
		System.out.println(a[0].length); //COLUMN size = 30
		System.out.println(a[2].length);//COLUMN size = 30
		System.out.println(a[5].length);//COLUMN size = 30
		//if 3D array you can't get z-axis length by lenght variable
	}
}
