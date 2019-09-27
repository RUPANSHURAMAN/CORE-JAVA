package NumberFormat;

public class L {
	public static void main(String[] args) {
		Object[] a = {10, "pankaj", 30.2, true};
		
		for(int i = 0; i<5; i++) {
			System.out.println(a[i]); //at a[4] indexout of bound exception as only allocated that much which is needed
		}
	}

}
