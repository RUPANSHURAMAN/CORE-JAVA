
public class A2 {
	{
		System.out.println("A2"); //Two times called
	}
	
	public static void main(String[] args) {
		A2 a1 = new A2();
		A2 a2 = new A2();
	}
}
