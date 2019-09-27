package NumberFormat;
//* Arrays by default gets some value, when we don't initialize it 
public class G {

	public static void main(String[] args) {
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 100;
		a[2] = 1000;
		
		for(int i = 0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
