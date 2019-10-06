package finalkeyword;
//DIFFERENT
public class I {

	public static void main(String[] args) {
		String[] a = {"10", "20"};
		
		// args = {"test", "pankaj"}; //ERROR as we can't initialize args as static array
		args = a; //but can assign static array
		System.out.println(args[0]);
	}
}
