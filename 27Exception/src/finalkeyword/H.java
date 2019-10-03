package finalkeyword;
//we can initialize size of args and give values to it by yourself
public class H {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		args = new String[3];
		args[0] = "10";
		System.out.println(args[0]);
	}
}
