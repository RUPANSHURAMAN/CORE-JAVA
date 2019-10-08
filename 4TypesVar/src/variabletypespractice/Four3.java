package variabletypespractice;

public class Four3 {
	static int j;
	int i;
	static Four3 f3;
	public static void main(String[] args) {
		int k;
		//System.out.println(k);// ERROR as local var k not initialized
		f3 = new Four3();
		System.out.println(f3.i);
		System.out.println(j);  
	}

}
