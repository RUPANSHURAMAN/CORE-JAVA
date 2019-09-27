package NumberFormat;
//* Sting Arrays by default gets some value, when we don't initialize it
public class H {
public static void main(String[] args) {
	String a[] = new String[4];
	a[0] = "test";
	a[1] = "10";
	a[2] = "xyz";
	
	for(int i = 0;i<a.length;i++)
		System.out.println(a[i]);

	System.out.println(a.toString()); //not print array but address
}
}
