package sibiib;

public class A11 {
	static int i;
	int j;
	static // SIB are used to initialize static vars
	{
		i = 20;
		//j = 30; //ERROR as using non-static field in static context
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println("From main");
	}
}
